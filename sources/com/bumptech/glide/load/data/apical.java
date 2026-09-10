package com.bumptech.glide.load.data;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: InputStreamRewinder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class apical implements marial<InputStream> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RecyclableBufferedInputStream f17589attabal;

    /* JADX INFO: compiled from: InputStreamRewinder.java */
    public static final class attabal implements marial.attabal<InputStream> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final trawler.saneness f17590attabal;

        public attabal(trawler.saneness sanenessVar) {
            this.f17590attabal = sanenessVar;
        }

        @Override // com.bumptech.glide.load.data.marial.attabal
        public Class<InputStream> attabal() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.marial.attabal
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public marial<InputStream> saneness(InputStream inputStream) {
            return new apical(inputStream, this.f17590attabal);
        }
    }

    public apical(InputStream inputStream, trawler.saneness sanenessVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, sanenessVar);
        this.f17589attabal = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    public void dern() {
        this.f17589attabal.saneness();
    }

    @Override // com.bumptech.glide.load.data.marial
    public void saneness() {
        this.f17589attabal.release();
    }

    @Override // com.bumptech.glide.load.data.marial
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public InputStream attabal() throws IOException {
        this.f17589attabal.reset();
        return this.f17589attabal;
    }
}
