package zc;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import l7.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f54846b;

    public /* synthetic */ m(FirebaseMessaging firebaseMessaging, int i10) {
        this.f54845a = i10;
        this.f54846b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i10 = this.f54845a;
        FirebaseMessaging firebaseMessaging = this.f54846b;
        switch (i10) {
            case 0:
                z zVar = (z) obj;
                if (firebaseMessaging.f24680f.c()) {
                    zVar.c();
                }
                break;
            default:
                h9.a aVar = (h9.a) obj;
                i0 i0Var = FirebaseMessaging.f24672n;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    d0.c.C(aVar.f42247a);
                    firebaseMessaging.h();
                }
                break;
        }
    }
}
