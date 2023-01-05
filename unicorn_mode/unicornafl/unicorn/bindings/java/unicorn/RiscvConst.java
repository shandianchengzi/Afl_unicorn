// For Unicorn Engine. AUTO-GENERATED FILE, DO NOT EDIT

package unicorn;

public interface RiscvConst {

// RISCV32 CPU

   public static final int UC_CPU_RISCV32_ANY = 0;
   public static final int UC_CPU_RISCV32_BASE32 = 1;
   public static final int UC_CPU_RISCV32_SIFIVE_E31 = 2;
   public static final int UC_CPU_RISCV32_SIFIVE_U34 = 3;
   public static final int UC_CPU_RISCV32_ENDING = 4;

// RISCV64 CPU

   public static final int UC_CPU_RISCV64_ANY = 0;
   public static final int UC_CPU_RISCV64_BASE64 = 1;
   public static final int UC_CPU_RISCV64_SIFIVE_E51 = 2;
   public static final int UC_CPU_RISCV64_SIFIVE_U54 = 3;
   public static final int UC_CPU_RISCV64_ENDING = 4;

// RISCV registers

   public static final int UC_RISCV_REG_INVALID = 0;

// General purpose registers
   public static final int UC_RISCV_REG_X0 = 1;
   public static final int UC_RISCV_REG_X1 = 2;
   public static final int UC_RISCV_REG_X2 = 3;
   public static final int UC_RISCV_REG_X3 = 4;
   public static final int UC_RISCV_REG_X4 = 5;
   public static final int UC_RISCV_REG_X5 = 6;
   public static final int UC_RISCV_REG_X6 = 7;
   public static final int UC_RISCV_REG_X7 = 8;
   public static final int UC_RISCV_REG_X8 = 9;
   public static final int UC_RISCV_REG_X9 = 10;
   public static final int UC_RISCV_REG_X10 = 11;
   public static final int UC_RISCV_REG_X11 = 12;
   public static final int UC_RISCV_REG_X12 = 13;
   public static final int UC_RISCV_REG_X13 = 14;
   public static final int UC_RISCV_REG_X14 = 15;
   public static final int UC_RISCV_REG_X15 = 16;
   public static final int UC_RISCV_REG_X16 = 17;
   public static final int UC_RISCV_REG_X17 = 18;
   public static final int UC_RISCV_REG_X18 = 19;
   public static final int UC_RISCV_REG_X19 = 20;
   public static final int UC_RISCV_REG_X20 = 21;
   public static final int UC_RISCV_REG_X21 = 22;
   public static final int UC_RISCV_REG_X22 = 23;
   public static final int UC_RISCV_REG_X23 = 24;
   public static final int UC_RISCV_REG_X24 = 25;
   public static final int UC_RISCV_REG_X25 = 26;
   public static final int UC_RISCV_REG_X26 = 27;
   public static final int UC_RISCV_REG_X27 = 28;
   public static final int UC_RISCV_REG_X28 = 29;
   public static final int UC_RISCV_REG_X29 = 30;
   public static final int UC_RISCV_REG_X30 = 31;
   public static final int UC_RISCV_REG_X31 = 32;

// RISCV CSR
   public static final int UC_RISCV_REG_USTATUS = 33;
   public static final int UC_RISCV_REG_UIE = 34;
   public static final int UC_RISCV_REG_UTVEC = 35;
   public static final int UC_RISCV_REG_USCRATCH = 36;
   public static final int UC_RISCV_REG_UEPC = 37;
   public static final int UC_RISCV_REG_UCAUSE = 38;
   public static final int UC_RISCV_REG_UTVAL = 39;
   public static final int UC_RISCV_REG_UIP = 40;
   public static final int UC_RISCV_REG_FFLAGS = 41;
   public static final int UC_RISCV_REG_FRM = 42;
   public static final int UC_RISCV_REG_FCSR = 43;
   public static final int UC_RISCV_REG_CYCLE = 44;
   public static final int UC_RISCV_REG_TIME = 45;
   public static final int UC_RISCV_REG_INSTRET = 46;
   public static final int UC_RISCV_REG_HPMCOUNTER3 = 47;
   public static final int UC_RISCV_REG_HPMCOUNTER4 = 48;
   public static final int UC_RISCV_REG_HPMCOUNTER5 = 49;
   public static final int UC_RISCV_REG_HPMCOUNTER6 = 50;
   public static final int UC_RISCV_REG_HPMCOUNTER7 = 51;
   public static final int UC_RISCV_REG_HPMCOUNTER8 = 52;
   public static final int UC_RISCV_REG_HPMCOUNTER9 = 53;
   public static final int UC_RISCV_REG_HPMCOUNTER10 = 54;
   public static final int UC_RISCV_REG_HPMCOUNTER11 = 55;
   public static final int UC_RISCV_REG_HPMCOUNTER12 = 56;
   public static final int UC_RISCV_REG_HPMCOUNTER13 = 57;
   public static final int UC_RISCV_REG_HPMCOUNTER14 = 58;
   public static final int UC_RISCV_REG_HPMCOUNTER15 = 59;
   public static final int UC_RISCV_REG_HPMCOUNTER16 = 60;
   public static final int UC_RISCV_REG_HPMCOUNTER17 = 61;
   public static final int UC_RISCV_REG_HPMCOUNTER18 = 62;
   public static final int UC_RISCV_REG_HPMCOUNTER19 = 63;
   public static final int UC_RISCV_REG_HPMCOUNTER20 = 64;
   public static final int UC_RISCV_REG_HPMCOUNTER21 = 65;
   public static final int UC_RISCV_REG_HPMCOUNTER22 = 66;
   public static final int UC_RISCV_REG_HPMCOUNTER23 = 67;
   public static final int UC_RISCV_REG_HPMCOUNTER24 = 68;
   public static final int UC_RISCV_REG_HPMCOUNTER25 = 69;
   public static final int UC_RISCV_REG_HPMCOUNTER26 = 70;
   public static final int UC_RISCV_REG_HPMCOUNTER27 = 71;
   public static final int UC_RISCV_REG_HPMCOUNTER28 = 72;
   public static final int UC_RISCV_REG_HPMCOUNTER29 = 73;
   public static final int UC_RISCV_REG_HPMCOUNTER30 = 74;
   public static final int UC_RISCV_REG_HPMCOUNTER31 = 75;
   public static final int UC_RISCV_REG_CYCLEH = 76;
   public static final int UC_RISCV_REG_TIMEH = 77;
   public static final int UC_RISCV_REG_INSTRETH = 78;
   public static final int UC_RISCV_REG_HPMCOUNTER3H = 79;
   public static final int UC_RISCV_REG_HPMCOUNTER4H = 80;
   public static final int UC_RISCV_REG_HPMCOUNTER5H = 81;
   public static final int UC_RISCV_REG_HPMCOUNTER6H = 82;
   public static final int UC_RISCV_REG_HPMCOUNTER7H = 83;
   public static final int UC_RISCV_REG_HPMCOUNTER8H = 84;
   public static final int UC_RISCV_REG_HPMCOUNTER9H = 85;
   public static final int UC_RISCV_REG_HPMCOUNTER10H = 86;
   public static final int UC_RISCV_REG_HPMCOUNTER11H = 87;
   public static final int UC_RISCV_REG_HPMCOUNTER12H = 88;
   public static final int UC_RISCV_REG_HPMCOUNTER13H = 89;
   public static final int UC_RISCV_REG_HPMCOUNTER14H = 90;
   public static final int UC_RISCV_REG_HPMCOUNTER15H = 91;
   public static final int UC_RISCV_REG_HPMCOUNTER16H = 92;
   public static final int UC_RISCV_REG_HPMCOUNTER17H = 93;
   public static final int UC_RISCV_REG_HPMCOUNTER18H = 94;
   public static final int UC_RISCV_REG_HPMCOUNTER19H = 95;
   public static final int UC_RISCV_REG_HPMCOUNTER20H = 96;
   public static final int UC_RISCV_REG_HPMCOUNTER21H = 97;
   public static final int UC_RISCV_REG_HPMCOUNTER22H = 98;
   public static final int UC_RISCV_REG_HPMCOUNTER23H = 99;
   public static final int UC_RISCV_REG_HPMCOUNTER24H = 100;
   public static final int UC_RISCV_REG_HPMCOUNTER25H = 101;
   public static final int UC_RISCV_REG_HPMCOUNTER26H = 102;
   public static final int UC_RISCV_REG_HPMCOUNTER27H = 103;
   public static final int UC_RISCV_REG_HPMCOUNTER28H = 104;
   public static final int UC_RISCV_REG_HPMCOUNTER29H = 105;
   public static final int UC_RISCV_REG_HPMCOUNTER30H = 106;
   public static final int UC_RISCV_REG_HPMCOUNTER31H = 107;
   public static final int UC_RISCV_REG_MCYCLE = 108;
   public static final int UC_RISCV_REG_MINSTRET = 109;
   public static final int UC_RISCV_REG_MCYCLEH = 110;
   public static final int UC_RISCV_REG_MINSTRETH = 111;
   public static final int UC_RISCV_REG_MVENDORID = 112;
   public static final int UC_RISCV_REG_MARCHID = 113;
   public static final int UC_RISCV_REG_MIMPID = 114;
   public static final int UC_RISCV_REG_MHARTID = 115;
   public static final int UC_RISCV_REG_MSTATUS = 116;
   public static final int UC_RISCV_REG_MISA = 117;
   public static final int UC_RISCV_REG_MEDELEG = 118;
   public static final int UC_RISCV_REG_MIDELEG = 119;
   public static final int UC_RISCV_REG_MIE = 120;
   public static final int UC_RISCV_REG_MTVEC = 121;
   public static final int UC_RISCV_REG_MCOUNTEREN = 122;
   public static final int UC_RISCV_REG_MSTATUSH = 123;
   public static final int UC_RISCV_REG_MUCOUNTEREN = 124;
   public static final int UC_RISCV_REG_MSCOUNTEREN = 125;
   public static final int UC_RISCV_REG_MHCOUNTEREN = 126;
   public static final int UC_RISCV_REG_MSCRATCH = 127;
   public static final int UC_RISCV_REG_MEPC = 128;
   public static final int UC_RISCV_REG_MCAUSE = 129;
   public static final int UC_RISCV_REG_MTVAL = 130;
   public static final int UC_RISCV_REG_MIP = 131;
   public static final int UC_RISCV_REG_MBADADDR = 132;
   public static final int UC_RISCV_REG_SSTATUS = 133;
   public static final int UC_RISCV_REG_SEDELEG = 134;
   public static final int UC_RISCV_REG_SIDELEG = 135;
   public static final int UC_RISCV_REG_SIE = 136;
   public static final int UC_RISCV_REG_STVEC = 137;
   public static final int UC_RISCV_REG_SCOUNTEREN = 138;
   public static final int UC_RISCV_REG_SSCRATCH = 139;
   public static final int UC_RISCV_REG_SEPC = 140;
   public static final int UC_RISCV_REG_SCAUSE = 141;
   public static final int UC_RISCV_REG_STVAL = 142;
   public static final int UC_RISCV_REG_SIP = 143;
   public static final int UC_RISCV_REG_SBADADDR = 144;
   public static final int UC_RISCV_REG_SPTBR = 145;
   public static final int UC_RISCV_REG_SATP = 146;
   public static final int UC_RISCV_REG_HSTATUS = 147;
   public static final int UC_RISCV_REG_HEDELEG = 148;
   public static final int UC_RISCV_REG_HIDELEG = 149;
   public static final int UC_RISCV_REG_HIE = 150;
   public static final int UC_RISCV_REG_HCOUNTEREN = 151;
   public static final int UC_RISCV_REG_HTVAL = 152;
   public static final int UC_RISCV_REG_HIP = 153;
   public static final int UC_RISCV_REG_HTINST = 154;
   public static final int UC_RISCV_REG_HGATP = 155;
   public static final int UC_RISCV_REG_HTIMEDELTA = 156;
   public static final int UC_RISCV_REG_HTIMEDELTAH = 157;

// Floating-point registers
   public static final int UC_RISCV_REG_F0 = 158;
   public static final int UC_RISCV_REG_F1 = 159;
   public static final int UC_RISCV_REG_F2 = 160;
   public static final int UC_RISCV_REG_F3 = 161;
   public static final int UC_RISCV_REG_F4 = 162;
   public static final int UC_RISCV_REG_F5 = 163;
   public static final int UC_RISCV_REG_F6 = 164;
   public static final int UC_RISCV_REG_F7 = 165;
   public static final int UC_RISCV_REG_F8 = 166;
   public static final int UC_RISCV_REG_F9 = 167;
   public static final int UC_RISCV_REG_F10 = 168;
   public static final int UC_RISCV_REG_F11 = 169;
   public static final int UC_RISCV_REG_F12 = 170;
   public static final int UC_RISCV_REG_F13 = 171;
   public static final int UC_RISCV_REG_F14 = 172;
   public static final int UC_RISCV_REG_F15 = 173;
   public static final int UC_RISCV_REG_F16 = 174;
   public static final int UC_RISCV_REG_F17 = 175;
   public static final int UC_RISCV_REG_F18 = 176;
   public static final int UC_RISCV_REG_F19 = 177;
   public static final int UC_RISCV_REG_F20 = 178;
   public static final int UC_RISCV_REG_F21 = 179;
   public static final int UC_RISCV_REG_F22 = 180;
   public static final int UC_RISCV_REG_F23 = 181;
   public static final int UC_RISCV_REG_F24 = 182;
   public static final int UC_RISCV_REG_F25 = 183;
   public static final int UC_RISCV_REG_F26 = 184;
   public static final int UC_RISCV_REG_F27 = 185;
   public static final int UC_RISCV_REG_F28 = 186;
   public static final int UC_RISCV_REG_F29 = 187;
   public static final int UC_RISCV_REG_F30 = 188;
   public static final int UC_RISCV_REG_F31 = 189;
   public static final int UC_RISCV_REG_PC = 190;
   public static final int UC_RISCV_REG_ENDING = 191;

// Alias registers
   public static final int UC_RISCV_REG_ZERO = 1;
   public static final int UC_RISCV_REG_RA = 2;
   public static final int UC_RISCV_REG_SP = 3;
   public static final int UC_RISCV_REG_GP = 4;
   public static final int UC_RISCV_REG_TP = 5;
   public static final int UC_RISCV_REG_T0 = 6;
   public static final int UC_RISCV_REG_T1 = 7;
   public static final int UC_RISCV_REG_T2 = 8;
   public static final int UC_RISCV_REG_S0 = 9;
   public static final int UC_RISCV_REG_FP = 9;
   public static final int UC_RISCV_REG_S1 = 10;
   public static final int UC_RISCV_REG_A0 = 11;
   public static final int UC_RISCV_REG_A1 = 12;
   public static final int UC_RISCV_REG_A2 = 13;
   public static final int UC_RISCV_REG_A3 = 14;
   public static final int UC_RISCV_REG_A4 = 15;
   public static final int UC_RISCV_REG_A5 = 16;
   public static final int UC_RISCV_REG_A6 = 17;
   public static final int UC_RISCV_REG_A7 = 18;
   public static final int UC_RISCV_REG_S2 = 19;
   public static final int UC_RISCV_REG_S3 = 20;
   public static final int UC_RISCV_REG_S4 = 21;
   public static final int UC_RISCV_REG_S5 = 22;
   public static final int UC_RISCV_REG_S6 = 23;
   public static final int UC_RISCV_REG_S7 = 24;
   public static final int UC_RISCV_REG_S8 = 25;
   public static final int UC_RISCV_REG_S9 = 26;
   public static final int UC_RISCV_REG_S10 = 27;
   public static final int UC_RISCV_REG_S11 = 28;
   public static final int UC_RISCV_REG_T3 = 29;
   public static final int UC_RISCV_REG_T4 = 30;
   public static final int UC_RISCV_REG_T5 = 31;
   public static final int UC_RISCV_REG_T6 = 32;
   public static final int UC_RISCV_REG_FT0 = 158;
   public static final int UC_RISCV_REG_FT1 = 159;
   public static final int UC_RISCV_REG_FT2 = 160;
   public static final int UC_RISCV_REG_FT3 = 161;
   public static final int UC_RISCV_REG_FT4 = 162;
   public static final int UC_RISCV_REG_FT5 = 163;
   public static final int UC_RISCV_REG_FT6 = 164;
   public static final int UC_RISCV_REG_FT7 = 165;
   public static final int UC_RISCV_REG_FS0 = 166;
   public static final int UC_RISCV_REG_FS1 = 167;
   public static final int UC_RISCV_REG_FA0 = 168;
   public static final int UC_RISCV_REG_FA1 = 169;
   public static final int UC_RISCV_REG_FA2 = 170;
   public static final int UC_RISCV_REG_FA3 = 171;
   public static final int UC_RISCV_REG_FA4 = 172;
   public static final int UC_RISCV_REG_FA5 = 173;
   public static final int UC_RISCV_REG_FA6 = 174;
   public static final int UC_RISCV_REG_FA7 = 175;
   public static final int UC_RISCV_REG_FS2 = 176;
   public static final int UC_RISCV_REG_FS3 = 177;
   public static final int UC_RISCV_REG_FS4 = 178;
   public static final int UC_RISCV_REG_FS5 = 179;
   public static final int UC_RISCV_REG_FS6 = 180;
   public static final int UC_RISCV_REG_FS7 = 181;
   public static final int UC_RISCV_REG_FS8 = 182;
   public static final int UC_RISCV_REG_FS9 = 183;
   public static final int UC_RISCV_REG_FS10 = 184;
   public static final int UC_RISCV_REG_FS11 = 185;
   public static final int UC_RISCV_REG_FT8 = 186;
   public static final int UC_RISCV_REG_FT9 = 187;
   public static final int UC_RISCV_REG_FT10 = 188;
   public static final int UC_RISCV_REG_FT11 = 189;

}
