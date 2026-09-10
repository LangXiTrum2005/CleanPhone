package x0;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.v;
import com.google.android.gms.common.api.internal.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.o f53524a;

    public h(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.o oVar) {
        this.f53524a = oVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void d(v vVar) {
        a.a(Looper.getMainLooper()).postDelayed(new b0(2), 500L);
        this.f53524a.b(this);
    }
}
