package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculate {

    private int oper1;
    private int oper2;
    
    private int summaPrivate() {
        return oper1 + oper2;
    }

    public int summa() {
        return summaPrivate();
    }

    public int summaWithParameters(int op1, int op2) {
        return op1 + op2;
    }

    public double summaDouble() {
        return oper1 + oper2 + (1.0 / 3.0);
    }

    public int div() {
        if (oper2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return oper1 / oper2;
    }
}
