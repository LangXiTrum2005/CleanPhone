package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Ej implements M0 {
    public final byte[] a;
    public final String b;

    public Ej(String location, byte[] imageBytes) {
        Intrinsics.checkNotNullParameter(imageBytes, "imageBytes");
        Intrinsics.checkNotNullParameter(location, "location");
        this.a = imageBytes;
        this.b = location;
    }

    @Override // com.inmobi.media.M0
    public final Object a() {
        byte[] bArr = this.a;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Intrinsics.beachfront(bitmapDecodeByteArray);
        return a(bitmapDecodeByteArray);
    }

    public final String a(Bitmap bitmap) {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String str = string + ".jpg";
        File file = new File(this.b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(this.b + "/" + str)));
        return this.b + "/" + str;
    }
}
