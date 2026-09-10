package com.umeng.analytics.pro;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public class bz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f2527a;
    private final db b;
    private cp c;

    public bz() {
        this(new cj.a());
    }

    public byte[] a(bq bqVar) throws bw {
        this.f2527a.reset();
        bqVar.write(this.c);
        return this.f2527a.toByteArray();
    }

    public String b(bq bqVar) throws bw {
        return new String(a(bqVar));
    }

    public bz(cr crVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f2527a = byteArrayOutputStream;
        db dbVar = new db(byteArrayOutputStream);
        this.b = dbVar;
        this.c = crVar.a(dbVar);
    }

    public String a(bq bqVar, String str) throws bw {
        try {
            return new String(a(bqVar), str);
        } catch (UnsupportedEncodingException unused) {
            throw new bw(AbstractC3888ke0.i("JVM DOES NOT SUPPORT ENCODING: ", str));
        }
    }
}
