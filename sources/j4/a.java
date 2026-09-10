package j4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43698b;

    public a(e eVar) {
        this.f43697a = 0;
        this.f43698b = new LinkedHashSet();
        eVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // j4.d
    public final Bundle a() {
        switch (this.f43697a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f43698b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((AppCompatActivity) this.f43698b).H().getClass();
                return bundle2;
        }
    }

    public a(AppCompatActivity appCompatActivity) {
        this.f43697a = 1;
        this.f43698b = appCompatActivity;
    }
}
