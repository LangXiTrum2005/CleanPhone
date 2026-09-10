package sg.bigo.ads.controller.b;

import android.os.Parcel;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements sg.bigo.ads.api.a.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[][] f47886n = {new int[]{1, 2}, new int[]{3, 4}};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f47891h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f47887a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f47888b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f47889c = "";
    int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f47890e = 0;
    int f = 0;
    int g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final a f47892i = new a(3);
    final a j = new a(4);
    final a k = new a(12);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final a f47893l = new a(1);
    final a m = new a(20);

    public class a implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47894a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47895b = 20;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47896c = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f47897e;

        public a(int i2) {
            this.f47897e = i2;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(Parcel parcel) {
            parcel.writeInt(this.f47894a);
            parcel.writeInt(this.f47895b);
            parcel.writeInt(this.f47897e);
            parcel.writeInt(this.f47896c);
        }

        @Override // sg.bigo.ads.common.f
        public final void b(Parcel parcel) {
            this.f47894a = parcel.readInt();
            this.f47895b = parcel.readInt();
            this.f47897e = parcel.readInt();
            this.f47896c = parcel.readInt();
        }

        public final void a(JSONObject jSONObject) {
            String str;
            int i2 = this.f47897e;
            if (i2 == 1) {
                this.f47894a = jSONObject.optInt("nat_load_fail_fill", 0);
                this.f47896c = jSONObject.optInt("nat_time_for_check_process", 5);
                str = "nat_min_video_loading_pro";
            } else if (i2 == 12) {
                this.f47894a = jSONObject.optInt("spl_load_fail_fill", 0);
                this.f47896c = jSONObject.optInt("spl_time_for_check_process", 5);
                str = "spl_min_video_loading_pro";
            } else if (i2 == 20) {
                this.f47894a = jSONObject.optInt("pop_load_fail_fill", 0);
                this.f47896c = jSONObject.optInt("pop_time_for_check_process", 5);
                str = "pop_min_video_loading_pro";
            } else if (i2 == 3) {
                this.f47894a = jSONObject.optInt("int_load_fail_fill", 0);
                this.f47896c = jSONObject.optInt("int_time_for_check_process", 5);
                str = "int_min_video_loading_pro";
            } else {
                if (i2 != 4) {
                    return;
                }
                this.f47894a = jSONObject.optInt("rew_load_fail_fill", 0);
                this.f47896c = jSONObject.optInt("rew_time_for_check_process", 5);
                str = "rew_min_video_loading_pro";
            }
            this.f47895b = jSONObject.optInt(str, 20);
        }
    }

    @Override // sg.bigo.ads.api.a.d
    public final int a() {
        return this.f47887a;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int b(int i2) {
        a aVar;
        if (i2 == 1) {
            aVar = this.f47893l;
        } else if (i2 == 12) {
            aVar = this.k;
        } else if (i2 == 20) {
            aVar = this.m;
        } else if (i2 == 3) {
            aVar = this.f47892i;
        } else {
            if (i2 != 4) {
                return 5;
            }
            aVar = this.j;
        }
        return aVar.f47896c;
    }

    @Override // sg.bigo.ads.api.a.d
    public final boolean c(int i2) {
        if (i2 == 1) {
            return this.f47893l.f47894a == 1;
        }
        if (i2 == 12) {
            return this.k.f47894a == 1;
        }
        if (i2 == 20) {
            return this.m.f47894a == 1;
        }
        if (i2 != 3) {
            return i2 == 4 && this.j.f47894a == 1;
        }
        return this.f47892i.f47894a == 1;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int d(int i2) {
        a aVar;
        if (i2 == 1) {
            aVar = this.f47893l;
        } else if (i2 == 12) {
            aVar = this.k;
        } else if (i2 == 20) {
            aVar = this.m;
        } else if (i2 == 3) {
            aVar = this.f47892i;
        } else {
            if (i2 != 4) {
                return 20;
            }
            aVar = this.j;
        }
        return aVar.f47895b;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int a(int i2) {
        if (i2 == 1) {
            return this.g;
        }
        if (i2 == 12) {
            return this.f;
        }
        if (i2 == 20) {
            return this.f47891h;
        }
        if (i2 == 3) {
            return this.d;
        }
        if (i2 != 4) {
            return 0;
        }
        return this.f47890e;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        this.f47887a = parcel.readInt();
        this.f47888b = parcel.readString();
        this.f47889c = parcel.readString();
        this.d = parcel.readInt();
        this.f47890e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        n.b(parcel, this.f47892i);
        n.b(parcel, this.j);
        n.b(parcel, this.k);
        n.b(parcel, this.f47893l);
        this.f47891h = parcel.readInt();
        n.b(parcel, this.m);
    }

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeInt(this.f47887a);
        parcel.writeString(this.f47888b);
        parcel.writeString(this.f47889c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f47890e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        n.a(parcel, this.f47892i);
        n.a(parcel, this.j);
        n.a(parcel, this.k);
        n.a(parcel, this.f47893l);
        parcel.writeInt(this.f47891h);
        n.a(parcel, this.m);
    }

    @Override // sg.bigo.ads.api.a.d
    public final boolean a(String str, int i2) {
        int i3 = !q.a((CharSequence) this.f47888b) ? 1 : 0;
        int i4 = !q.a((CharSequence) this.f47889c) ? 1 : 0;
        if (a(i2) > 0) {
            int i5 = f47886n[i3][i4];
            if (i5 != 1) {
                if (i5 != 2) {
                    return i5 == 3 && q.a(this.f47888b.split(","), str);
                }
                if (!q.a(this.f47889c.split(","), str)) {
                }
            }
            return true;
        }
        return false;
    }
}
