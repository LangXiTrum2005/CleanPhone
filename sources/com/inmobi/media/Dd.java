package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Dd implements InterfaceC3169p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f22783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22784b;

    public Dd(String location, byte[] imageBytes) {
        Intrinsics.f(imageBytes, "imageBytes");
        Intrinsics.f(location, "location");
        this.f22783a = imageBytes;
        this.f22784b = location;
    }

    @Override // com.inmobi.media.InterfaceC3169p0
    public final Object a() {
        byte[] bArr = this.f22783a;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Intrinsics.c(bitmapDecodeByteArray);
        String string = UUID.randomUUID().toString();
        Intrinsics.e(string, "toString(...)");
        String strConcat = string.concat(".jpg");
        File file = new File(this.f22784b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(this.f22784b + IOUtils.DIR_SEPARATOR_UNIX + strConcat)));
        Log.i("StoreProcess", "screenshot file saved");
        return this.f22784b + IOUtils.DIR_SEPARATOR_UNIX + strConcat;
    }
}
