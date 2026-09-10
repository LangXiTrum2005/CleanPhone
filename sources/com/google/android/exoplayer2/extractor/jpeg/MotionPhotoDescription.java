package com.google.android.exoplayer2.extractor.jpeg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class MotionPhotoDescription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17654b;

    public static final class ContainerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17657c;

        public ContainerItem(String str, long j, long j2) {
            this.f17655a = str;
            this.f17656b = j;
            this.f17657c = j2;
        }
    }

    public MotionPhotoDescription(long j, List list) {
        this.f17653a = j;
        this.f17654b = list;
    }
}
