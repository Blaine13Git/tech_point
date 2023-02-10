package com.windsing.tech_point.about_enum;

public enum LetterEnum {

    LETTER_a("a", 1),
    LETTER_b("b", 2),
    LETTER_c("c", 3),
    LETTER_d("d", 4),
    LETTER_e("e", 5),
    LETTER_f("f", 6),
    LETTER_g("g", 7),
    LETTER_h("h", 8),
    LETTER_i("i", 9),
    LETTER_j("j", 10),
    LETTER_k("k", 11),
    LETTER_l("l", 12),
    LETTER_m("m", 13),
    LETTER_n("n", 14),
    LETTER_o("o", 15);

    // 成员变量
    private String letter;
    private int index;

    LetterEnum(String letter, int index) {
        this.letter = letter;
        this.index = index;
    }

    // 覆盖方法
    @Override
    public String toString() {
        return this.index + "-" + this.letter;
    }

}
