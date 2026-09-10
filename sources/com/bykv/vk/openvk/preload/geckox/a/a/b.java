package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12907a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f12908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected a f12909c;
    protected File d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected List<String> f12910e;

    static {
        new f();
        f12908b = new e();
    }

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f12909c = aVar;
        this.d = file;
        this.f12910e = list;
    }
}
