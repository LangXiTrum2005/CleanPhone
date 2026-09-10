package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends FutureTask<h> implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f32121a;

    public c(h hVar) {
        super(hVar, null);
        this.f32121a = hVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        h hVar = this.f32121a;
        int i10 = hVar.f32174a;
        h hVar2 = cVar.f32121a;
        int i11 = hVar2.f32174a;
        return i10 == i11 ? hVar.f32175b - hVar2.f32175b : i11 - i10;
    }
}
