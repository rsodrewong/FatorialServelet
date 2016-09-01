/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anderson0563
 */
public class fatorial {
    private int n;
    
    public fatorial(int n)
    {
        this.n=n;
    }
    
    private int calculo(int n)
    {
        if(n<=1) return 1;
        else return n*calculo(n-1);
    }
    
    @Override
    public String toString()
    {
        if(this.n>=0) 
            return "O fatorial de " + this.n + " vale " + String.valueOf(calculo(this.n));
        else
            return "Não existe fatorial de número negativo (n="+this.n+")";
    }
}
