package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.premeiotic;
import androidx.core.view.treadless;
import com.ironsource.Ua;

/* JADX INFO: compiled from: TooltipCompatHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class starveling implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public static starveling f5558cord;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static starveling f5559preprohormone;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f5560adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final CharSequence f5561arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public hydrovane f5562dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f5563gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f5564graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final View f5565kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final int f5567monoploid;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public boolean f5569rotuma;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final Runnable f5568polloi = new Runnable() { // from class: androidx.appcompat.widget.privatdozent
        @Override // java.lang.Runnable
        public final void run() {
            this.f5548kowloon.impromptu(false);
        }
    };

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final Runnable f5566molybdenite = new Runnable() { // from class: androidx.appcompat.widget.creditor
        @Override // java.lang.Runnable
        public final void run() {
            this.f5427kowloon.wireman();
        }
    };

    public starveling(View view, CharSequence charSequence) {
        this.f5565kowloon = view;
        this.f5561arytenoidectomy = charSequence;
        this.f5567monoploid = treadless.competently(ViewConfiguration.get(view.getContext()));
        dern();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void beachfront(starveling starvelingVar) {
        starveling starvelingVar2 = f5559preprohormone;
        if (starvelingVar2 != null) {
            starvelingVar2.saneness();
        }
        f5559preprohormone = starvelingVar;
        if (starvelingVar != null) {
            starvelingVar.marial();
        }
    }

    public static void competently(View view, CharSequence charSequence) {
        starveling starvelingVar = f5559preprohormone;
        if (starvelingVar != null && starvelingVar.f5565kowloon == view) {
            beachfront(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new starveling(view, charSequence);
            return;
        }
        starveling starvelingVar2 = f5558cord;
        if (starvelingVar2 != null && starvelingVar2.f5565kowloon == view) {
            starvelingVar2.wireman();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void dern() {
        this.f5569rotuma = true;
    }

    public void impromptu(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (this.f5565kowloon.isAttachedToWindow()) {
            beachfront(null);
            starveling starvelingVar = f5558cord;
            if (starvelingVar != null) {
                starvelingVar.wireman();
            }
            f5558cord = this;
            this.f5563gintrap = z;
            hydrovane hydrovaneVar = new hydrovane(this.f5565kowloon.getContext());
            this.f5562dovishness = hydrovaneVar;
            hydrovaneVar.marial(this.f5565kowloon, this.f5564graveside, this.f5560adultoid, this.f5563gintrap, this.f5561arytenoidectomy);
            this.f5565kowloon.addOnAttachStateChangeListener(this);
            if (this.f5563gintrap) {
                j2 = 2500;
            } else {
                if ((premeiotic.seminary(this.f5565kowloon) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = Ua.C;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            this.f5565kowloon.removeCallbacks(this.f5566molybdenite);
            this.f5565kowloon.postDelayed(this.f5566molybdenite, j2);
        }
    }

    public final void marial() {
        this.f5565kowloon.postDelayed(this.f5568polloi, ViewConfiguration.getLongPressTimeout());
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f5562dovishness != null && this.f5563gintrap) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f5565kowloon.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                dern();
                wireman();
            }
        } else if (this.f5565kowloon.isEnabled() && this.f5562dovishness == null && taiyuan(motionEvent)) {
            beachfront(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f5564graveside = view.getWidth() / 2;
        this.f5560adultoid = view.getHeight() / 2;
        impromptu(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        wireman();
    }

    public final void saneness() {
        this.f5565kowloon.removeCallbacks(this.f5568polloi);
    }

    public final boolean taiyuan(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f5569rotuma && Math.abs(x - this.f5564graveside) <= this.f5567monoploid && Math.abs(y - this.f5560adultoid) <= this.f5567monoploid) {
            return false;
        }
        this.f5564graveside = x;
        this.f5560adultoid = y;
        this.f5569rotuma = false;
        return true;
    }

    public void wireman() {
        if (f5558cord == this) {
            f5558cord = null;
            hydrovane hydrovaneVar = this.f5562dovishness;
            if (hydrovaneVar != null) {
                hydrovaneVar.dern();
                this.f5562dovishness = null;
                dern();
                this.f5565kowloon.removeOnAttachStateChangeListener(this);
            }
        }
        if (f5559preprohormone == this) {
            beachfront(null);
        }
        this.f5565kowloon.removeCallbacks(this.f5566molybdenite);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
