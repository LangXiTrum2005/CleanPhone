package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bi implements Serializable {
    public static final a h = new a(0);
    private static final long serialVersionUID = -3616216391305196341L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f607a;
    public final String b;
    public final Set<String> c;
    final b d;
    public String e;
    public final Integer f;
    public final Integer g;
    private final c i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final String a(long j) {
            if (j < 1000) {
                return j + " B";
            }
            double d = j;
            double d2 = 1000;
            int iLog = (int) (Math.log(d) / Math.log(d2));
            return String.format("%.1f %sB", Arrays.copyOf(new Object[]{Double.valueOf(d / Math.pow(d2, iLog)), Character.valueOf("kMGTPE".charAt(iLog - 1))}, 2));
        }
    }

    public enum b {
        NOT_LEAKING,
        LEAKING,
        UNKNOWN
    }

    public enum c {
        CLASS,
        ARRAY,
        INSTANCE
    }

    public bi(long j, c cVar, String str, Set<String> set, b bVar, String str2, Integer num, Integer num2) {
        AbstractC2995aW.q(cVar, "type");
        AbstractC2995aW.q(str, "className");
        AbstractC2995aW.q(set, "labels");
        AbstractC2995aW.q(bVar, "leakingStatus");
        AbstractC2995aW.q(str2, "leakingStatusReason");
        this.f607a = j;
        this.i = cVar;
        this.b = str;
        this.c = set;
        this.d = bVar;
        this.e = str2;
        this.f = num;
        this.g = num2;
    }

    public final void a(String str) {
        AbstractC2995aW.q(str, "<set-?>");
        this.e = str;
    }

    public final String b() {
        String strName = this.i.name();
        Locale locale = Locale.US;
        AbstractC2995aW.p(locale, "Locale.US");
        if (strName == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = strName.toLowerCase(locale);
        AbstractC2995aW.p(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        return this.f607a == biVar.f607a && AbstractC2995aW.i(this.i, biVar.i) && AbstractC2995aW.i(this.b, biVar.b) && AbstractC2995aW.i(this.c, biVar.c) && AbstractC2995aW.i(this.d, biVar.d) && AbstractC2995aW.i(this.e, biVar.e) && AbstractC2995aW.i(this.f, biVar.f) && AbstractC2995aW.i(this.g, biVar.g);
    }

    public int hashCode() {
        long j = this.f607a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        c cVar = this.i;
        int iHashCode = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Set<String> set = this.c;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        b bVar = this.d;
        int iHashCode4 = (iHashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.g;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return a(this, "", "\u200b  ", true, null, 8);
    }

    public final String a() {
        return ct.a(this.b, '.');
    }

    public static /* synthetic */ String a(bi biVar, String str, String str2, boolean z, String str3, int i) {
        if ((i & 8) != 0) {
            str3 = biVar.b();
        }
        return biVar.a(str, str2, z, str3);
    }

    public final String a(String str, String str2, boolean z, String str3) {
        String strL;
        AbstractC2995aW.q(str, "firstLinePrefix");
        AbstractC2995aW.q(str2, "additionalLinesPrefix");
        AbstractC2995aW.q(str3, "typeName");
        int i = bj.f610a[this.d.ordinal()];
        if (i == 1) {
            strL = "UNKNOWN";
        } else if (i == 2) {
            strL = DM.l(new StringBuilder("NO ("), this.e, ')');
        } else if (i == 3) {
            strL = DM.l(new StringBuilder("YES ("), this.e, ')');
        } else {
            throw new C3770jF(7, 0);
        }
        String str4 = "" + str + this.b + ' ' + str3;
        if (z) {
            str4 = str4 + '\n' + str2 + "Leaking: " + strL;
        }
        Integer num = this.f;
        if (num != null) {
            str4 = str4 + '\n' + str2 + "Retaining " + h.a(num.intValue()) + " in " + this.g + " objects";
        }
        Iterator<String> it = this.c.iterator();
        while (it.hasNext()) {
            str4 = str4 + '\n' + str2 + it.next();
        }
        return str4;
    }
}
