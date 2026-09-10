package com.smartdigimkt.b4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class i {
    private static final String d = "com.apple.iTunes";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f33918e = "iTunSMPB";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33919a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33920b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.smartdigimkt.g4.g.b f33917c = new a();
    private static final Pattern f = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    public class a implements com.smartdigimkt.g4.g.b {
        @Override // com.smartdigimkt.g4.g.b
        public boolean a(int i2, int i3, int i4, int i5, int i6) {
            if (i3 == 67 && i4 == 79 && i5 == 77) {
                return i6 == 77 || i2 == 2;
            }
            return false;
        }
    }

    public boolean a(int i2) {
        int i3 = i2 >> 12;
        int i4 = i2 & 4095;
        if (i3 <= 0 && i4 <= 0) {
            return false;
        }
        this.f33919a = i3;
        this.f33920b = i4;
        return true;
    }

    public boolean a(com.smartdigimkt.e4.a aVar) {
        for (int i2 = 0; i2 < aVar.a(); i2++) {
            com.smartdigimkt.e4.a.b bVarA = aVar.a(i2);
            if (bVarA instanceof com.smartdigimkt.g4.e) {
                com.smartdigimkt.g4.e eVar = (com.smartdigimkt.g4.e) bVarA;
                if (f33918e.equals(eVar.f35416c) && a(eVar.d)) {
                    return true;
                }
            } else if (bVarA instanceof com.smartdigimkt.g4.i) {
                com.smartdigimkt.g4.i iVar = (com.smartdigimkt.g4.i) bVarA;
                if (d.equals(iVar.f35434b) && f33918e.equals(iVar.f35435c) && a(iVar.d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean a(String str) {
        Matcher matcher = f.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i2 = Integer.parseInt(matcher.group(1), 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f33919a = i2;
            this.f33920b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f33919a == -1 || this.f33920b == -1) ? false : true;
    }
}
