package com.neuedu.work;


    public class Worker {
        private String name;
        private int age;
        private int price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public Worker(String name, int age, int price) {
            this.name = name;
            this.age = age;
            this.price = price;
        }
        public void work(){
            System.out.println(getName()+"正在工作");
        }
        @Override
        public String toString() {
            return "姓名" + name + " " + "年龄" + age + " " + "工资" + price;
        }
    }


