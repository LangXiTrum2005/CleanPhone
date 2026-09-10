package starveling;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: MotionEventAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0011J/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010!R \u0010(\u001a\u00020#8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001d0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0016\u00101\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010/\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Lstarveling/beachfront;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "motionEvent", "Lstarveling/yemenite;", "positionCalculator", "Lstarveling/gintrap;", "dern", "(Landroid/view/MotionEvent;Lstarveling/yemenite;)Lstarveling/gintrap;", "", "pointerId", "", "marial", "(I)V", "attabal", "(Landroid/view/MotionEvent;)V", "impromptu", "", "competently", "(Landroid/view/MotionEvent;I)Z", "motionEventPointerId", "Lstarveling/graveside;", "beachfront", "(I)J", "saneness", "index", "pressed", "Lstarveling/rotuma;", "wireman", "(Lstarveling/yemenite;Landroid/view/MotionEvent;IZ)Lstarveling/rotuma;", "", "J", "nextId", "Landroid/util/SparseLongArray;", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "motionEventToComposePointerIdMap", "Landroid/util/SparseBooleanArray;", "Landroid/util/SparseBooleanArray;", "activeHoverIds", "", "Ljava/util/List;", "pointers", "I", "previousToolType", "previousSource", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public long nextId;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final SparseBooleanArray activeHoverIds = new SparseBooleanArray();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final List<PointerInputEventData> pointers = new ArrayList();

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int previousToolType = -1;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int previousSource = -1;

    public final void attabal(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j = this.nextId;
                this.nextId = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j2 = this.nextId;
            this.nextId = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    public final long beachfront(int motionEventPointerId) {
        long jValueAt;
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(motionEventPointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.nextId;
            this.nextId = 1 + jValueAt;
            this.motionEventToComposePointerIdMap.put(motionEventPointerId, jValueAt);
        }
        return graveside.attabal(jValueAt);
    }

    public final boolean competently(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    public final gintrap dern(MotionEvent motionEvent, yemenite positionCalculator) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            return null;
        }
        saneness(motionEvent);
        attabal(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.activeHoverIds.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        while (i < pointerCount) {
            this.pointers.add(wireman(positionCalculator, motionEvent, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
            i++;
        }
        impromptu(motionEvent);
        return new gintrap(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    public final void impromptu(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!competently(motionEvent, iKeyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.activeHoverIds.delete(iKeyAt);
                }
            }
        }
    }

    public final void marial(int pointerId) {
        this.activeHoverIds.delete(pointerId);
        this.motionEventToComposePointerIdMap.delete(pointerId);
    }

    public final void saneness(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.activeHoverIds.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    public final PointerInputEventData wireman(yemenite positionCalculator, MotionEvent motionEvent, int index, boolean pressed) {
        long jGraveside;
        int iMarial;
        long jBeachfront = beachfront(motionEvent.getPointerId(index));
        float pressure = motionEvent.getPressure(index);
        long jAttabal = supplicat.impromptu.attabal(motionEvent.getX(index), motionEvent.getY(index));
        long jCompetently = supplicat.competently.competently(jAttabal, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null);
        if (index == 0) {
            jGraveside = supplicat.impromptu.attabal(motionEvent.getRawX(), motionEvent.getRawY());
            jAttabal = positionCalculator.triweekly(jGraveside);
        } else if (Build.VERSION.SDK_INT >= 29) {
            jGraveside = taiyuan.f38155attabal.attabal(motionEvent, index);
            jAttabal = positionCalculator.triweekly(jGraveside);
        } else {
            jGraveside = positionCalculator.graveside(jAttabal);
        }
        long j = jGraveside;
        long j2 = jAttabal;
        int toolType = motionEvent.getToolType(index);
        if (toolType == 0) {
            iMarial = oilcan.INSTANCE.marial();
        } else if (toolType == 1) {
            iMarial = oilcan.INSTANCE.wireman();
        } else if (toolType == 2) {
            iMarial = oilcan.INSTANCE.dern();
        } else if (toolType != 3) {
            iMarial = toolType != 4 ? oilcan.INSTANCE.marial() : oilcan.INSTANCE.attabal();
        } else {
            iMarial = oilcan.INSTANCE.saneness();
        }
        int i = iMarial;
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        for (int i2 = 0; i2 < historySize; i2++) {
            float historicalX = motionEvent.getHistoricalX(index, i2);
            float historicalY = motionEvent.getHistoricalY(index, i2);
            if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                long jAttabal2 = supplicat.impromptu.attabal(historicalX, historicalY);
                arrayList.add(new HistoricalChange(motionEvent.getHistoricalEventTime(i2), jAttabal2, jAttabal2, null));
            }
        }
        return new PointerInputEventData(jBeachfront, motionEvent.getEventTime(), j, j2, pressed, pressure, i, this.activeHoverIds.get(motionEvent.getPointerId(index), false), arrayList, motionEvent.getActionMasked() == 8 ? supplicat.impromptu.attabal(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : supplicat.competently.INSTANCE.dern(), jCompetently, null);
    }
}
