package com.smartdigimkt.e4;

import com.smartdigimkt.w3.m;

/* JADX INFO: loaded from: classes5.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f34611a = new a();

    public class a implements d {
        @Override // com.smartdigimkt.e4.d
        public boolean a(m mVar) {
            String str = mVar.f;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str);
        }

        @Override // com.smartdigimkt.e4.d
        public b b(m mVar) {
            String str = mVar.f;
            str.getClass();
            switch (str) {
                case "application/id3":
                    return new com.smartdigimkt.g4.g();
                case "application/x-emsg":
                    return new com.smartdigimkt.f4.b();
                case "application/x-scte35":
                    return new com.smartdigimkt.h4.c();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    }

    boolean a(m mVar);

    b b(m mVar);
}
