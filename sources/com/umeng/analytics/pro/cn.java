package com.umeng.analytics.pro;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes3.dex */
public final class cn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2546a;
    public final byte b;
    public final int c;

    public cn() {
        this("", (byte) 0, 0);
    }

    public boolean a(cn cnVar) {
        return this.f2546a.equals(cnVar.f2546a) && this.b == cnVar.b && this.c == cnVar.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof cn) {
            return a((cn) obj);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<TMessage name:'");
        sb.append(this.f2546a);
        sb.append("' type: ");
        sb.append((int) this.b);
        sb.append(" seqid:");
        return AbstractC5044xl.o(sb, this.c, ">");
    }

    public cn(String str, byte b, int i) {
        this.f2546a = str;
        this.b = b;
        this.c = i;
    }
}
