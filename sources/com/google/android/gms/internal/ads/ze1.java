package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ze1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f22592b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayInputStream f22593a;

    public ze1(ByteArrayInputStream byteArrayInputStream) {
        this.f22593a = byteArrayInputStream;
    }

    public static int b(dr1 dr1Var) throws IOException {
        if (!(dr1Var instanceof hr1)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!(dr1Var.m().f15368a instanceof Number)) {
            throw new IOException("invalid key id: not a JSON number");
        }
        Number numberN = dr1Var.m().n();
        try {
            if (!(numberN instanceof bi1)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long j10 = Long.parseLong(((bi1) numberN).f12797a);
            if (j10 > 4294967295L || j10 < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) j10;
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x022a A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0222 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    /* JADX WARN: Code duplicated, block: B:54:0x0131 A[Catch: all -> 0x002f, gr1 | IllegalStateException -> 0x0032, gr1 | IllegalStateException -> 0x0032, TRY_ENTER, TRY_LEAVE, TryCatch #0 {gr1 | IllegalStateException -> 0x0032, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:11:0x0035, B:13:0x004e, B:15:0x0056, B:17:0x0060, B:19:0x006a, B:21:0x007d, B:23:0x0083, B:25:0x0095, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00af, B:49:0x00fa, B:49:0x00fa, B:54:0x0131, B:54:0x0131, B:67:0x0154, B:67:0x0154, B:69:0x016a, B:69:0x016a, B:71:0x0170, B:71:0x0170, B:73:0x0176, B:73:0x0176, B:88:0x01e5, B:88:0x01e5, B:89:0x0218, B:89:0x0218, B:90:0x0221, B:90:0x0221, B:91:0x0222, B:91:0x0222, B:92:0x0229, B:92:0x0229, B:58:0x013c, B:58:0x013c, B:62:0x0147, B:62:0x0147, B:66:0x0152, B:66:0x0152, B:93:0x022a, B:93:0x022a, B:94:0x0233, B:94:0x0233, B:95:0x0234, B:95:0x0234, B:96:0x023d, B:96:0x023d, B:97:0x023e, B:97:0x023e, B:98:0x0245, B:98:0x0245, B:99:0x0246, B:99:0x0246, B:100:0x024d, B:100:0x024d, B:101:0x024e, B:101:0x024e, B:104:0x0258, B:104:0x0258, B:105:0x025f, B:105:0x025f, B:106:0x0260, B:106:0x0260, B:107:0x0267, B:107:0x0267, B:108:0x0268, B:108:0x0268, B:109:0x026f, B:109:0x026f), top: B:114:0x0016, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0134  */
    /* JADX WARN: Code duplicated, block: B:58:0x013c A[Catch: all -> 0x002f, gr1 | IllegalStateException -> 0x0032, gr1 | IllegalStateException -> 0x0032, TRY_ENTER, TRY_LEAVE, TryCatch #0 {gr1 | IllegalStateException -> 0x0032, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:11:0x0035, B:13:0x004e, B:15:0x0056, B:17:0x0060, B:19:0x006a, B:21:0x007d, B:23:0x0083, B:25:0x0095, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00af, B:49:0x00fa, B:49:0x00fa, B:54:0x0131, B:54:0x0131, B:67:0x0154, B:67:0x0154, B:69:0x016a, B:69:0x016a, B:71:0x0170, B:71:0x0170, B:73:0x0176, B:73:0x0176, B:88:0x01e5, B:88:0x01e5, B:89:0x0218, B:89:0x0218, B:90:0x0221, B:90:0x0221, B:91:0x0222, B:91:0x0222, B:92:0x0229, B:92:0x0229, B:58:0x013c, B:58:0x013c, B:62:0x0147, B:62:0x0147, B:66:0x0152, B:66:0x0152, B:93:0x022a, B:93:0x022a, B:94:0x0233, B:94:0x0233, B:95:0x0234, B:95:0x0234, B:96:0x023d, B:96:0x023d, B:97:0x023e, B:97:0x023e, B:98:0x0245, B:98:0x0245, B:99:0x0246, B:99:0x0246, B:100:0x024d, B:100:0x024d, B:101:0x024e, B:101:0x024e, B:104:0x0258, B:104:0x0258, B:105:0x025f, B:105:0x025f, B:106:0x0260, B:106:0x0260, B:107:0x0267, B:107:0x0267, B:108:0x0268, B:108:0x0268, B:109:0x026f, B:109:0x026f), top: B:114:0x0016, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0147 A[Catch: all -> 0x002f, gr1 | IllegalStateException -> 0x0032, gr1 | IllegalStateException -> 0x0032, TRY_ENTER, TRY_LEAVE, TryCatch #0 {gr1 | IllegalStateException -> 0x0032, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:11:0x0035, B:13:0x004e, B:15:0x0056, B:17:0x0060, B:19:0x006a, B:21:0x007d, B:23:0x0083, B:25:0x0095, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00af, B:49:0x00fa, B:49:0x00fa, B:54:0x0131, B:54:0x0131, B:67:0x0154, B:67:0x0154, B:69:0x016a, B:69:0x016a, B:71:0x0170, B:71:0x0170, B:73:0x0176, B:73:0x0176, B:88:0x01e5, B:88:0x01e5, B:89:0x0218, B:89:0x0218, B:90:0x0221, B:90:0x0221, B:91:0x0222, B:91:0x0222, B:92:0x0229, B:92:0x0229, B:58:0x013c, B:58:0x013c, B:62:0x0147, B:62:0x0147, B:66:0x0152, B:66:0x0152, B:93:0x022a, B:93:0x022a, B:94:0x0233, B:94:0x0233, B:95:0x0234, B:95:0x0234, B:96:0x023d, B:96:0x023d, B:97:0x023e, B:97:0x023e, B:98:0x0245, B:98:0x0245, B:99:0x0246, B:99:0x0246, B:100:0x024d, B:100:0x024d, B:101:0x024e, B:101:0x024e, B:104:0x0258, B:104:0x0258, B:105:0x025f, B:105:0x025f, B:106:0x0260, B:106:0x0260, B:107:0x0267, B:107:0x0267, B:108:0x0268, B:108:0x0268, B:109:0x026f, B:109:0x026f), top: B:114:0x0016, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0152 A[Catch: all -> 0x002f, gr1 | IllegalStateException -> 0x0032, gr1 | IllegalStateException -> 0x0032, TRY_ENTER, TryCatch #0 {gr1 | IllegalStateException -> 0x0032, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:11:0x0035, B:13:0x004e, B:15:0x0056, B:17:0x0060, B:19:0x006a, B:21:0x007d, B:23:0x0083, B:25:0x0095, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00af, B:49:0x00fa, B:49:0x00fa, B:54:0x0131, B:54:0x0131, B:67:0x0154, B:67:0x0154, B:69:0x016a, B:69:0x016a, B:71:0x0170, B:71:0x0170, B:73:0x0176, B:73:0x0176, B:88:0x01e5, B:88:0x01e5, B:89:0x0218, B:89:0x0218, B:90:0x0221, B:90:0x0221, B:91:0x0222, B:91:0x0222, B:92:0x0229, B:92:0x0229, B:58:0x013c, B:58:0x013c, B:62:0x0147, B:62:0x0147, B:66:0x0152, B:66:0x0152, B:93:0x022a, B:93:0x022a, B:94:0x0233, B:94:0x0233, B:95:0x0234, B:95:0x0234, B:96:0x023d, B:96:0x023d, B:97:0x023e, B:97:0x023e, B:98:0x0245, B:98:0x0245, B:99:0x0246, B:99:0x0246, B:100:0x024d, B:100:0x024d, B:101:0x024e, B:101:0x024e, B:104:0x0258, B:104:0x0258, B:105:0x025f, B:105:0x025f, B:106:0x0260, B:106:0x0260, B:107:0x0267, B:107:0x0267, B:108:0x0268, B:108:0x0268, B:109:0x026f, B:109:0x026f), top: B:114:0x0016, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x016a A[Catch: all -> 0x002f, gr1 | IllegalStateException -> 0x0032, gr1 | IllegalStateException -> 0x0032, TryCatch #0 {gr1 | IllegalStateException -> 0x0032, blocks: (B:3:0x0016, B:4:0x0023, B:6:0x002b, B:11:0x0035, B:13:0x004e, B:15:0x0056, B:17:0x0060, B:19:0x006a, B:21:0x007d, B:23:0x0083, B:25:0x0095, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:33:0x00af, B:49:0x00fa, B:49:0x00fa, B:54:0x0131, B:54:0x0131, B:67:0x0154, B:67:0x0154, B:69:0x016a, B:69:0x016a, B:71:0x0170, B:71:0x0170, B:73:0x0176, B:73:0x0176, B:88:0x01e5, B:88:0x01e5, B:89:0x0218, B:89:0x0218, B:90:0x0221, B:90:0x0221, B:91:0x0222, B:91:0x0222, B:92:0x0229, B:92:0x0229, B:58:0x013c, B:58:0x013c, B:62:0x0147, B:62:0x0147, B:66:0x0152, B:66:0x0152, B:93:0x022a, B:93:0x022a, B:94:0x0233, B:94:0x0233, B:95:0x0234, B:95:0x0234, B:96:0x023d, B:96:0x023d, B:97:0x023e, B:97:0x023e, B:98:0x0245, B:98:0x0245, B:99:0x0246, B:99:0x0246, B:100:0x024d, B:100:0x024d, B:101:0x024e, B:101:0x024e, B:104:0x0258, B:104:0x0258, B:105:0x025f, B:105:0x025f, B:106:0x0260, B:106:0x0260, B:107:0x0267, B:107:0x0267, B:108:0x0268, B:108:0x0268, B:109:0x026f, B:109:0x026f), top: B:114:0x0016, outer: #1 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final bn1 a() throws IOException {
        int i10;
        String strB;
        on1 on1Var;
        nr1 nr1Var;
        int i11;
        String str = "status";
        String str2 = "keyData";
        ByteArrayInputStream byteArrayInputStream = this.f22593a;
        try {
            try {
                int i12 = jf1.f16086a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i13 = byteArrayInputStream.read(bArr);
                    if (i13 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i13);
                }
                fr1 fr1VarH = gc1.g(new String(byteArrayOutputStream.toByteArray(), f22592b)).h();
                nr1 nr1Var2 = fr1VarH.f14521a;
                if (!nr1Var2.containsKey(X3.i.W)) {
                    throw new gr1("invalid keyset: no key");
                }
                dr1 dr1VarN = fr1VarH.n(X3.i.W);
                if (!(dr1VarN instanceof cr1)) {
                    throw new gr1("invalid keyset: key must be an array");
                }
                ArrayList arrayList = ((cr1) dr1VarN).f13245a;
                if (arrayList.size() == 0) {
                    throw new gr1("invalid keyset: key is empty");
                }
                ym1 ym1VarF = bn1.F();
                if (nr1Var2.containsKey("primaryKeyId")) {
                    int iB = b(fr1VarH.n("primaryKeyId"));
                    ym1VarF.b();
                    ((bn1) ym1VarF.f19193b).G(iB);
                }
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    fr1 fr1VarH2 = ((dr1) arrayList.get(i14)).h();
                    nr1 nr1Var3 = fr1VarH2.f14521a;
                    if (!nr1Var3.containsKey(str2) || !nr1Var3.containsKey(str) || !nr1Var3.containsKey("keyId") || !nr1Var3.containsKey("outputPrefixType")) {
                        throw new gr1("invalid key");
                    }
                    dr1 dr1VarN2 = fr1VarH2.n(str2);
                    if (!(dr1VarN2 instanceof fr1)) {
                        throw new gr1("invalid key: keyData must be an object");
                    }
                    zm1 zm1VarD = an1.D();
                    String strB2 = fr1VarH2.n(str).b();
                    String str3 = str;
                    int iHashCode = strB2.hashCode();
                    String str4 = str2;
                    int i15 = 3;
                    if (iHashCode == -891611359) {
                        if (!strB2.equals("ENABLED")) {
                            throw new gr1("unknown status: ".concat(strB2));
                        }
                        i10 = 3;
                        zm1VarD.b();
                        ((an1) zm1VarD.f19193b).I(i10);
                        int iB2 = b(fr1VarH2.n("keyId"));
                        zm1VarD.b();
                        ((an1) zm1VarD.f19193b).F(iB2);
                        strB = fr1VarH2.n("outputPrefixType").b();
                        switch (strB.hashCode()) {
                            case -2053249079:
                                if (strB.equals("LEGACY")) {
                                    on1Var = on1.LEGACY;
                                    zm1VarD.b();
                                    ((an1) zm1VarD.f19193b).G(on1Var);
                                    fr1 fr1VarH3 = dr1VarN2.h();
                                    nr1Var = fr1VarH3.f14521a;
                                    if (nr1Var.containsKey("typeUrl")) {
                                    }
                                    throw new gr1("invalid keyData");
                                }
                                break;
                            case 80904:
                                if (strB.equals("RAW")) {
                                    on1Var = on1.RAW;
                                    zm1VarD.b();
                                    ((an1) zm1VarD.f19193b).G(on1Var);
                                    fr1 fr1VarH4 = dr1VarN2.h();
                                    nr1Var = fr1VarH4.f14521a;
                                    if (nr1Var.containsKey("typeUrl")) {
                                    }
                                    throw new gr1("invalid keyData");
                                }
                                break;
                            case 2575090:
                                if (strB.equals("TINK")) {
                                    on1Var = on1.TINK;
                                    zm1VarD.b();
                                    ((an1) zm1VarD.f19193b).G(on1Var);
                                    fr1 fr1VarH5 = dr1VarN2.h();
                                    nr1Var = fr1VarH5.f14521a;
                                    if (nr1Var.containsKey("typeUrl")) {
                                    }
                                    throw new gr1("invalid keyData");
                                }
                                break;
                            case 1761684556:
                                if (strB.equals("CRUNCHY")) {
                                    on1Var = on1.CRUNCHY;
                                    zm1VarD.b();
                                    ((an1) zm1VarD.f19193b).G(on1Var);
                                    fr1 fr1VarH6 = dr1VarN2.h();
                                    nr1Var = fr1VarH6.f14521a;
                                    if (nr1Var.containsKey("typeUrl")) {
                                    }
                                    throw new gr1("invalid keyData");
                                }
                                break;
                        }
                        throw new gr1("unknown output prefix type: ".concat(strB));
                    }
                    if (iHashCode == 478389753) {
                        if (!strB2.equals("DESTROYED")) {
                            throw new gr1("unknown status: ".concat(strB2));
                        }
                        i10 = 5;
                        zm1VarD.b();
                        ((an1) zm1VarD.f19193b).I(i10);
                        int iB3 = b(fr1VarH2.n("keyId"));
                        zm1VarD.b();
                        ((an1) zm1VarD.f19193b).F(iB3);
                        strB = fr1VarH2.n("outputPrefixType").b();
                        switch (strB.hashCode()) {
                            case -2053249079:
                                if (strB.equals("LEGACY")) {
                                    on1Var = on1.LEGACY;
                                    zm1VarD.b();
                                    ((an1) zm1VarD.f19193b).G(on1Var);
                                    fr1 fr1VarH7 = dr1VarN2.h();
                                    nr1Var = fr1VarH7.f14521a;
                                    if (nr1Var.containsKey("typeUrl")) {
                                    }
                                    throw new gr1("invalid keyData");
                                }
                                break;
                            case 80904:
                                if (strB.equals("RAW")) {
                                    on1Var = on1.RAW;
                                    zm1VarD.b();
                                    ((an1) zm1VarD.f19193b).G(on1Var);
                                    fr1 fr1VarH8 = dr1VarN2.h();
                                    nr1Var = fr1VarH8.f14521a;
                                    if (nr1Var.containsKey("typeUrl")) {
                                    }
                                    throw new gr1("invalid keyData");
                                }
                                break;
                            case 2575090:
                                if (strB.equals("TINK")) {
                                    on1Var = on1.TINK;
                                    zm1VarD.b();
                                    ((an1) zm1VarD.f19193b).G(on1Var);
                                    fr1 fr1VarH9 = dr1VarN2.h();
                                    nr1Var = fr1VarH9.f14521a;
                                    if (nr1Var.containsKey("typeUrl")) {
                                    }
                                    throw new gr1("invalid keyData");
                                }
                                break;
                            case 1761684556:
                                if (strB.equals("CRUNCHY")) {
                                    on1Var = on1.CRUNCHY;
                                    zm1VarD.b();
                                    ((an1) zm1VarD.f19193b).G(on1Var);
                                    fr1 fr1VarH10 = dr1VarN2.h();
                                    nr1Var = fr1VarH10.f14521a;
                                    if (nr1Var.containsKey("typeUrl")) {
                                    }
                                    throw new gr1("invalid keyData");
                                }
                                break;
                        }
                        throw new gr1("unknown output prefix type: ".concat(strB));
                    }
                    if (iHashCode != 1053567612 || !strB2.equals("DISABLED")) {
                        throw new gr1("unknown status: ".concat(strB2));
                    }
                    i10 = 4;
                    zm1VarD.b();
                    ((an1) zm1VarD.f19193b).I(i10);
                    int iB4 = b(fr1VarH2.n("keyId"));
                    zm1VarD.b();
                    ((an1) zm1VarD.f19193b).F(iB4);
                    strB = fr1VarH2.n("outputPrefixType").b();
                    switch (strB.hashCode()) {
                        case -2053249079:
                            if (strB.equals("LEGACY")) {
                                on1Var = on1.LEGACY;
                                zm1VarD.b();
                                ((an1) zm1VarD.f19193b).G(on1Var);
                                fr1 fr1VarH11 = dr1VarN2.h();
                                nr1Var = fr1VarH11.f14521a;
                                if (nr1Var.containsKey("typeUrl") || !nr1Var.containsKey(X3.i.X) || !nr1Var.containsKey("keyMaterialType")) {
                                    throw new gr1("invalid keyData");
                                }
                                byte[] bArrA = kq1.a(fr1VarH11.n(X3.i.X).b());
                                tm1 tm1VarC = um1.C();
                                String strB3 = fr1VarH11.n("typeUrl").b();
                                tm1VarC.b();
                                ((um1) tm1VarC.f19193b).E(strB3);
                                as1 as1VarD = cs1.D(bArrA, 0, bArrA.length);
                                tm1VarC.b();
                                ((um1) tm1VarC.f19193b).F(as1VarD);
                                String strB4 = fr1VarH11.n("keyMaterialType").b();
                                switch (strB4.hashCode()) {
                                    case -1881281466:
                                        if (!strB4.equals("REMOTE")) {
                                            throw new gr1("unknown key material type: ".concat(strB4));
                                        }
                                        i11 = 5;
                                        continue;
                                        tm1VarC.b();
                                        ((um1) tm1VarC.f19193b).G(i11);
                                        um1 um1Var = (um1) tm1VarC.e();
                                        zm1VarD.b();
                                        ((an1) zm1VarD.f19193b).E(um1Var);
                                        an1 an1Var = (an1) zm1VarD.e();
                                        ym1VarF.b();
                                        ((bn1) ym1VarF.f19193b).H(an1Var);
                                        i14++;
                                        str = str3;
                                        str2 = str4;
                                        break;
                                        break;
                                    case -1609477353:
                                        if (!strB4.equals("SYMMETRIC")) {
                                            throw new gr1("unknown key material type: ".concat(strB4));
                                        }
                                        i15 = 2;
                                        break;
                                        break;
                                    case 249237018:
                                        if (!strB4.equals("ASYMMETRIC_PRIVATE")) {
                                            throw new gr1("unknown key material type: ".concat(strB4));
                                        }
                                        break;
                                    case 1534613202:
                                        if (!strB4.equals("ASYMMETRIC_PUBLIC")) {
                                            throw new gr1("unknown key material type: ".concat(strB4));
                                        }
                                        i11 = 4;
                                        continue;
                                        tm1VarC.b();
                                        ((um1) tm1VarC.f19193b).G(i11);
                                        um1 um1Var2 = (um1) tm1VarC.e();
                                        zm1VarD.b();
                                        ((an1) zm1VarD.f19193b).E(um1Var2);
                                        an1 an1Var2 = (an1) zm1VarD.e();
                                        ym1VarF.b();
                                        ((bn1) ym1VarF.f19193b).H(an1Var2);
                                        i14++;
                                        str = str3;
                                        str2 = str4;
                                        break;
                                        break;
                                    default:
                                        throw new gr1("unknown key material type: ".concat(strB4));
                                }
                                i11 = i15;
                                tm1VarC.b();
                                ((um1) tm1VarC.f19193b).G(i11);
                                um1 um1Var3 = (um1) tm1VarC.e();
                                zm1VarD.b();
                                ((an1) zm1VarD.f19193b).E(um1Var3);
                                an1 an1Var3 = (an1) zm1VarD.e();
                                ym1VarF.b();
                                ((bn1) ym1VarF.f19193b).H(an1Var3);
                                i14++;
                                str = str3;
                                str2 = str4;
                            }
                            break;
                        case 80904:
                            if (strB.equals("RAW")) {
                                on1Var = on1.RAW;
                                zm1VarD.b();
                                ((an1) zm1VarD.f19193b).G(on1Var);
                                fr1 fr1VarH12 = dr1VarN2.h();
                                nr1Var = fr1VarH12.f14521a;
                                if (nr1Var.containsKey("typeUrl")) {
                                }
                                throw new gr1("invalid keyData");
                            }
                            break;
                        case 2575090:
                            if (strB.equals("TINK")) {
                                on1Var = on1.TINK;
                                zm1VarD.b();
                                ((an1) zm1VarD.f19193b).G(on1Var);
                                fr1 fr1VarH13 = dr1VarN2.h();
                                nr1Var = fr1VarH13.f14521a;
                                if (nr1Var.containsKey("typeUrl")) {
                                }
                                throw new gr1("invalid keyData");
                            }
                            break;
                        case 1761684556:
                            if (strB.equals("CRUNCHY")) {
                                on1Var = on1.CRUNCHY;
                                zm1VarD.b();
                                ((an1) zm1VarD.f19193b).G(on1Var);
                                fr1 fr1VarH14 = dr1VarN2.h();
                                nr1Var = fr1VarH14.f14521a;
                                if (nr1Var.containsKey("typeUrl")) {
                                }
                                throw new gr1("invalid keyData");
                            }
                            break;
                    }
                    throw new gr1("unknown output prefix type: ".concat(strB));
                }
                bn1 bn1Var = (bn1) ym1VarF.e();
                byteArrayInputStream.close();
                return bn1Var;
            } catch (gr1 | IllegalStateException e10) {
                throw new IOException(e10);
            }
        } catch (Throwable th2) {
            byteArrayInputStream.close();
            throw th2;
        }
    }
}
