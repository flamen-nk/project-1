package com.company;

import java.sql.SQLOutput;

public class Triangle {
        private double x1, x2, x3;
        private double y1, y2, y3;

        public Triangle() {
        }

        public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
                this.x1 = x1;
                this.x2 = x2;
                this.x3 = x3;
                this.y1 = y1;
                this.y2 = y2;
                this.y3 = y3;
        }

        public double getVertexA() {
                return Math.abs(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));//AB
        }

        public double getVertexB() {
                return Math.abs(Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1)));//AC
        }

        public double getVertexC() {
                return Math.abs(Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2)));//BC
        }

        public double getPerimeter() {
                return getVertexA() + getVertexB() + getVertexC();
        }

        public double getArea() {

                return Math.sqrt((getPerimeter() / 2) *
                        ((getPerimeter() / 2) - getVertexA()) *
                        ((getPerimeter() / 2) - getVertexB()) *
                        ((getPerimeter() / 2) - getVertexC()));
        }

        public double getAngleA() {
                double vxAB = getX2() - getX1();
                double vyAB = getY2() - getY1();
                double vxAC = getX3() - getX1();
                double vyAC = getY3() - getY1();

                double cosA = (vxAC * vxAB + vyAC * vyAB) / (getVertexB() * getVertexA());
                return Math.acos(cosA) * 180 / Math.PI;

        }
        public double getAngleB() {
                double vxBA = getX1() - getX2();
                double vyBA = getY1() - getY2();
                double vxBC = getX3() - getX2();
                double vyBC = getY3() - getY2();

                double cosB = (vxBA * vxBC + vyBA * vyBC) / (getVertexA() * getVertexC());
                return Math.acos(cosB) * 180 / Math.PI;
        }

        public double getAngleC() {
                double vxCB = getX2() - getX3();
                double vyCB = getY2() - getY3();
                double vxCA = getX1() - getX3();
                double vyCA = getY1() - getY3();

                double cosC = (vxCB * vxCA + vyCB * vyCA) / (getVertexC() * getVertexB());
                return Math.acos(cosC) * 180 / Math.PI;
        }

        public String getType() {
                String type;
                if (getAngleA() == 90 || getAngleB() == 90 || getAngleC()==90) {
                        return "Rectangular";
                } else if (getVertexA() == getVertexB() ||  getVertexC() == getVertexB()) {
                        return "Isosceles";
                } else {
                        return "Versatile";
                }
        }

        public double getX1() {
                return x1;
        }

        public void setX1(double x1) {
                this.x1 = x1;
        }

        public double getX2() {
                return x2;
        }

        public void setX2(double x2) {
                this.x2 = x2;
        }

        public double getX3() {
                return x3;
        }

        public void setX3(double x3) {
                this.x3 = x3;
        }

        public double getY1() {
                return y1;
        }

        public void setY1(double y1) {
                this.y1 = y1;
        }

        public double getY2() {
                return y2;
        }

        public void setY2(double y2) {
                this.y2 = y2;
        }

        public double getY3() {
                return y3;
        }

        public void setY3(double y3) {
                this.y3 = y3;
        }
}