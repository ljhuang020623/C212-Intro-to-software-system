public class Problem6 {

    public static boolean test1(boolean P, boolean Q, boolean R){
        return cond(P, not(bicond(Q, not(R))));
    }

    public static boolean test2(boolean P, boolean Q, boolean R){
        return or(and(P, Q), not(R));
    }
    public static boolean and(boolean P, boolean Q) {
        return (P && Q);
    }
    public static boolean or(boolean P, boolean Q){
        return (P || Q);
    }
    public static boolean not(boolean P){
        return !P;
    }
    public static boolean cond(boolean P, boolean Q){
        return Q || !P;
    }

    public static boolean bicond(boolean P, boolean Q){
        return ((P && Q) || (!P && !Q));
    }
}