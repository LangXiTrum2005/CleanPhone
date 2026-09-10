package com.smartdigimkt.e8;

/* JADX INFO: loaded from: classes5.dex */
public class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f34647i = "a";
    private static final int j = 1;

    @Override // com.smartdigimkt.e8.c
    public synchronized void a(com.smartdigimkt.d8.c cVar, com.smartdigimkt.d8.c.a aVar) throws Exception {
        try {
            int iA = a(this.d.getInputStream());
            if (iA != 1) {
                throw new Exception("Response Error Code:" + iA);
            }
            if (aVar != null) {
                aVar.a(cVar);
            }
            cVar.toString();
        } catch (Throwable th) {
            throw th;
        }
    }
}
