package com.umeng.analytics.pro;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes3.dex */
public class ck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2543a;
    public final byte b;
    public final short c;

    public ck() {
        this("", (byte) 0, (short) 0);
    }

    public boolean a(ck ckVar) {
        return this.b == ckVar.b && this.c == ckVar.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<TField name:'");
        sb.append(this.f2543a);
        sb.append("' type:");
        sb.append((int) this.b);
        sb.append(" field-id:");
        return AbstractC5044xl.o(sb, this.c, ">");
    }

    public ck(String str, byte b, short s) {
        this.f2543a = str;
        this.b = b;
        this.c = s;
    }
}
