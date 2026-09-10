package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10532e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AssetManager assetManager, String str, int i10) {
        super(0, str, assetManager);
        this.f10532e = i10;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f10532e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final void g(Object obj) throws IOException {
        switch (this.f10532e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Object i(AssetManager assetManager, String str) {
        switch (this.f10532e) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
