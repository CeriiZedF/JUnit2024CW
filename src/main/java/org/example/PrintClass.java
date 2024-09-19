package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class PrintClass {

    @NonNull
    private Calculate calculate;

    public String stringSumma() {
        if (calculate == null) {
            throw new IllegalStateException("Calculate instance is not initialized");
        }
        return String.valueOf(calculate.summa());
    }

    public String stringSummaStatic(int op1, int op2) {
        if (calculate == null) {
            throw new IllegalStateException("Calculate instance is not initialized");
        }
        return String.valueOf(calculate.summaWithParameters(op1, op2));
    }
}
