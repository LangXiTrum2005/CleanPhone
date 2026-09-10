package com.bykv.vk.openvk.preload.b;

/* JADX INFO: loaded from: classes.dex */
public interface e {

    public static class a implements e {
        @Override // com.bykv.vk.openvk.preload.b.e
        public final <T> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    <T> T a(Class<T> cls);
}
