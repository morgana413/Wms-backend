package com.example.warehousedemo1.common;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;


public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/wms01", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("sino") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .outputDir("src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder ->
                        builder.parent("com.example.warehousedemo1") // 设置父包名
                                .entity("entity")
                                .mapper("mapper")
                                .service("service")
                                .serviceImpl("service.Impl")
                                .controller("controller")
                )
                .strategyConfig(builder ->
                        builder.entityBuilder()
                                .enableLombok()
                                .controllerBuilder()
                                .enableRestStyle()
                )
                .execute();
    }
}
