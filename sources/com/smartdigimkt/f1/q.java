package com.smartdigimkt.f1;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class q {

    public interface a {
        void a(int i2);
    }

    public interface b {
        void a(int i2);

        void a(k kVar);

        void a(String str);

        void a(List<m> list);

        void a(List<k> list, int i2);
    }

    public interface c {
        void a(int i2);

        void a(k kVar);

        void a(com.smartdigimkt.x.d dVar, String str);

        void b(k kVar);

        void c(k kVar);

        boolean c();

        void d(k kVar);

        void onFinishRedirection(k kVar, String str);

        void onRedirectionFailed(k kVar, String str);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f35000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35001b;

        public d(int i2, int i3) {
            this.f35000a = i2;
            this.f35001b = i3;
        }

        public int a() {
            return this.f35001b;
        }

        public int b() {
            return this.f35000a;
        }

        public void a(int i2) {
            this.f35001b = i2;
        }

        public void b(int i2) {
            this.f35000a = i2;
        }
    }

    public interface e extends c {
        void onLeaveApp();
    }
}
