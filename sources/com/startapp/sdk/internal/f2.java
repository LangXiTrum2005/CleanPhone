package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class f2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f40952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f40953c;

    public f2(String str, Bitmap bitmap, Context context) {
        this.f40951a = str;
        this.f40952b = bitmap;
        this.f40953c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        FileOutputStream fileOutputStream;
        g2.f40993a.put(this.f40951a.concat(".png"), this.f40952b);
        try {
            fileOutputStream = new FileOutputStream(this.f40953c.getFilesDir().getPath() + "/" + this.f40951a + ".png");
            try {
                this.f40952b.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                vi.a(fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    g9.a(th);
                } finally {
                    vi.a(fileOutputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }
}
