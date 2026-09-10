package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.util.taiyuan;
import com.bumptech.glide.util.wireman;
import endosteum.cutely;
import java.io.IOException;
import java.io.InputStream;
import maggot.marial;

/* JADX INFO: compiled from: StreamBitmapDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class dern implements marial<InputStream, Bitmap> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.attabal f17844attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final trawler.saneness f17845saneness;

    /* JADX INFO: compiled from: StreamBitmapDecoder.java */
    public static class attabal implements com.bumptech.glide.load.resource.bitmap.attabal.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final RecyclableBufferedInputStream f17846attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final wireman f17847saneness;

        public attabal(RecyclableBufferedInputStream recyclableBufferedInputStream, wireman wiremanVar) {
            this.f17846attabal = recyclableBufferedInputStream;
            this.f17847saneness = wiremanVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.attabal.saneness
        public void attabal(trawler.wireman wiremanVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionAttabal = this.f17847saneness.attabal();
            if (iOExceptionAttabal != null) {
                if (bitmap == null) {
                    throw iOExceptionAttabal;
                }
                wiremanVar.dern(bitmap);
                throw iOExceptionAttabal;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.attabal.saneness
        public void saneness() {
            this.f17846attabal.saneness();
        }
    }

    public dern(com.bumptech.glide.load.resource.bitmap.attabal attabalVar, trawler.saneness sanenessVar) {
        this.f17844attabal = attabalVar;
        this.f17845saneness = sanenessVar;
    }

    @Override // maggot.marial
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public cutely<Bitmap> attabal(InputStream inputStream, int i, int i2, maggot.wireman wiremanVar) throws IOException {
        boolean z;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            z = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f17845saneness);
        }
        wireman wiremanVarSaneness = wireman.saneness(recyclableBufferedInputStream);
        try {
            return this.f17844attabal.beachfront(new taiyuan(wiremanVarSaneness), i, i2, wiremanVar, new attabal(recyclableBufferedInputStream, wiremanVarSaneness));
        } finally {
            wiremanVarSaneness.release();
            if (z) {
                recyclableBufferedInputStream.release();
            }
        }
    }

    @Override // maggot.marial
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public boolean saneness(InputStream inputStream, maggot.wireman wiremanVar) {
        return this.f17844attabal.arytenoidectomy(inputStream);
    }
}
