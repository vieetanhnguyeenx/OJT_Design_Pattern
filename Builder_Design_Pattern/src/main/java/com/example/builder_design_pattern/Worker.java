package com.example.builder_design_pattern;

public class Worker {
    private final int id;
    private final String name;
    private final String address;
    private final String email;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public Worker(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
        this.email = builder.email;
    }

    public static class Builder {
        private int id;
        private String name;
        private String address;
        private String email;

        public Builder id(final int id) {
            this.id = id;
            return this;
        }

        public Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Builder address(final String address) {
            this.address = address;
            return this;
        }

        public Builder email(final String email) {
            this.email = email;
            return this;
        }

        public Worker Build() {
            return new Worker(this);
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
