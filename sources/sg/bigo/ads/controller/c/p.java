package sg.bigo.ads.controller.c;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f48016a = new ArrayList();

    public static abstract class a {
        private a() {
        }

        public abstract int a();

        public abstract void a(ByteBuffer byteBuffer);

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(final int i2) {
        this.f48016a.add(new a() { // from class: sg.bigo.ads.controller.c.p.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((byte) 0);
            }

            @Override // sg.bigo.ads.controller.c.p.a
            public final int a() {
                return 4;
            }

            @Override // sg.bigo.ads.controller.c.p.a
            public final void a(ByteBuffer byteBuffer) {
                byteBuffer.putInt(i2);
            }
        });
    }

    public final void a(String str) {
        this.f48016a.add(new a(str) { // from class: sg.bigo.ads.controller.c.p.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final byte[] f48017a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f48018b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                byte[] bytes;
                super((byte) 0);
                this.f48018b = str;
                try {
                    bytes = str.getBytes("UTF-8");
                } catch (Exception unused) {
                    bytes = new byte[0];
                }
                this.f48017a = bytes;
            }

            @Override // sg.bigo.ads.controller.c.p.a
            public final int a() {
                return this.f48017a.length + 4;
            }

            @Override // sg.bigo.ads.controller.c.p.a
            public final void a(ByteBuffer byteBuffer) {
                byteBuffer.putInt(this.f48017a.length);
                byteBuffer.put(this.f48017a);
            }
        });
    }
}
