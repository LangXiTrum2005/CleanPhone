package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f19551Y;

    public /* synthetic */ b(Object obj, int i2) {
        this.X = i2;
        this.f19551Y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                Object obj = ((MaterialTimePicker) this.f19551Y).j0;
                if (obj instanceof TimePickerTextInputPresenter) {
                    ((TimePickerTextInputPresenter) obj).d();
                }
                break;
            default:
                ((RadialViewGroup) this.f19551Y).l();
                break;
        }
    }
}
