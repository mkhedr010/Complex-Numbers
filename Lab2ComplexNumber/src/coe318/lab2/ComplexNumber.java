package coe318.lab2;

/**
 * ComplexNumber models a complex number expressed in rectangular form (real and
 * imaginary parts). It is an <em>immutable</em> object.
 *
 * @author Mohamed Khedr
 */
public class ComplexNumber {
//Instance variable declarations
    double real;
    double imaginary;

    /**
     * Construct a ComplexNumber given its real and imaginary parts.
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(double re, double im) {
//Initialize the instance variables
real = re;
imaginary = im;
    }

    /**
     * Returns the real component.
     *
     * @return the real
     */
    public double getReal() {
        return real;	//A stub: to be fixed
    }

    /**
     * Returns the imaginary component.
     *
     * @return the imaginary
     */
    public double getImaginary() {
        return imaginary;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber number that is the negative of <em>this</em>.
     * Note: the original ComplexNumber is <b>NOT</b>
     * modified.
     *
     * @return -this
     */
    public  ComplexNumber negate() {
      ComplexNumber  Neg = new ComplexNumber(-real, -imaginary);
    return Neg ;
    }

    /**
     * Returns a new ComplexNumber that is the sum of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber add(ComplexNumber z) {
        ComplexNumber Add = new ComplexNumber((real+z.getReal()), (imaginary + z.getImaginary()));
                
        return Add;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the difference of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber subtract(ComplexNumber z) {
      // ComplexNumber Sub = new ComplexNumber((real-z.getReal()), (imaginary - z.getImaginary()));
      //  return Sub;	//A stub: to be fixed
      
      return this.add(z.negate());
    }

    /**
     * Returns a new ComplexNumber that is the product of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this * z
     */
    public ComplexNumber multiply(ComplexNumber z) {
        double R;
        double I;
      //  (a + ib) (c + id) = (ac - bd) + i(ad + bc)
        R = real*z.getReal()-imaginary*z.getImaginary();
        I = real*z.getImaginary() + imaginary*z.getReal();
    ComplexNumber Mult = new ComplexNumber (R, I);
        return Mult;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the reciprocal of <em>this</em>.
     * Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @return 1.0 / this
     */
    public ComplexNumber reciprocal() {
        double mod = real*real + imaginary*imaginary;
        double R = real/mod;
        double I = -imaginary/mod;
      ComplexNumber Reci =  new ComplexNumber (R, I); 
        return Reci;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is
     * <em>this</em> divided by <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this / z
     */
    public ComplexNumber divide(ComplexNumber z) {
   //   double a = this.getReal();
   //   double b = this.getImaginary();
    //  double c = z.getReal();
    //  double d = z.getImaginary();
      // real = (ac+bd)/[cc+dd]
      // imaginary = (bc-ad)/[cc+dd]
       //         double R = ((a*c+b*d) /((c*c)+(d*d)));
      //  double I = ((b*c-a*d) /((c*c)+(d*d)));
   //   ComplexNumber Div =  new ComplexNumber (R, I);
   
        return this.multiply(z.reciprocal());	//A stub: to be fixed
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     *	real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the the sign of the imagrinary part.
     * <p>
     * Examples:
     * <pre>
     *	..println(new ComplexNumber(0,0); -> "0.0"
     *	..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     *	..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
//DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}
