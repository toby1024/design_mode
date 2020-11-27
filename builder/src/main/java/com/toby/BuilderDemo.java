package com.toby;

import java.util.Objects;

/**
 * @Author: zhangbin
 * @Date: 2020/11/26
 */
public class BuilderDemo {
    private String name;
    private int age;
    private String phone;
    private String email;

    private BuilderDemo(BuilderDemoBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.phone = builder.phone;
        this.email = builder.email;
    }

    public static class BuilderDemoBuilder {
        private String name;
        private int age;
        private String phone;
        private String email;

        public BuilderDemo build() {
            return new BuilderDemo(this);
        }

        public BuilderDemoBuilder setName(String name) {
            if (Objects.isNull(name)) {
                throw new IllegalArgumentException("name must not null");
            }
            this.name = name;
            return this;
        }

        public BuilderDemoBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public BuilderDemoBuilder setPhone(String phone) {
            if (Objects.isNull(name)) {
                throw new IllegalArgumentException("phone must not null");
            }
            this.phone = phone;
            return this;
        }

        public BuilderDemoBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
    }

    public static void main(String[] args) {
        BuilderDemo build = new BuilderDemoBuilder().setAge(18).setEmail("email").setName("name").setPhone("13812340987").build();
        System.out.println(build.name);
    }
}
