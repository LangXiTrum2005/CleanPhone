package com.bykv.vk.openvk.preload.a;

/* JADX INFO: loaded from: classes.dex */
public interface e {

    public static class a implements e {
        @Override // com.bykv.vk.openvk.preload.a.e
        public final <T> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    <T> T a(Class<T> cls);
}
