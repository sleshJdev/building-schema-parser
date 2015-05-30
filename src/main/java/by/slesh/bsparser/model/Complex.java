package by.slesh.bsparser.model;


/** @author Eugene Putsykovich(slesh) May 30, 2015
 * 
 *         represent complex number */
public class Complex {

        private double re;
        private double im;

        public Complex() {
        }

        public Complex(Complex complex) {
                this.re = complex.getRe();
                this.im = complex.getIm();
        }

        public Complex(double re, double im) {
                this.re = re;
                this.im = im;
        }

        public double getRe() {
                return re;
        }

        public void setRe(double re) {
                this.re = re;
        }

        public double getIm() {
                return im;
        }

        public void setIm(double im) {
                this.im = im;
        }

        public Complex multiply(Complex c) {
                double valueRe = (getRe() * c.getRe()) - (getIm() * c.getIm());
                double valueIm = (getIm() * c.getRe()) + (getRe() * c.getIm());

                return new Complex(valueRe, valueIm);
        }

        public Complex add(Complex c) {
                return new Complex(getRe() + c.getRe(), getIm() + c.getIm());
        }

        public Complex subtract(Complex c) {
                return new Complex(getRe() - c.getRe(), getIm() - c.getIm());
        }

        public Complex divided(Complex c) {
                double divider = Math.pow(c.getRe(), 2) + Math.pow(c.getIm(), 2);
                double valueRe = (getRe() * c.getRe() + getIm() * c.getIm()) / divider;
                double valueIm = (getIm() * c.getRe() - getRe() * c.getIm()) / divider;

                return new Complex(valueRe, valueIm);
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) { return false; }
                if (!(o instanceof Complex)) { return false; }

                Complex c = (Complex) o;

                return getRe() == c.getRe() && getIm() == c.getIm();
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
                return new Complex(getRe(), getIm());
        }

        @Override
        public String toString() {
                return String.format("%f %s i%f", getRe(), Math.signum(getIm()) == -1 ? "-" : "+", Math.abs(getIm()));
        }
}
