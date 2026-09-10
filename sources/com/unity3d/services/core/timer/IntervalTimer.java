package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.LifecycleCache;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class IntervalTimer extends BaseTimer implements IIntervalTimer {
    private final AtomicInteger _currentPosition;
    private final Integer _intervalDuration;
    private Integer _nextInterval;
    private IIntervalTimerListener _timerListener;
    private final Integer _totalIntervals;

    public IntervalTimer(Integer num, Integer num2, IIntervalTimerListener iIntervalTimerListener, LifecycleCache lifecycleCache) {
        super(num, null, lifecycleCache);
        this._currentPosition = new AtomicInteger(0);
        this._totalIntervals = num2;
        this._timerListener = iIntervalTimerListener;
        int iIntValue = num2.intValue();
        int iIntValue2 = num.intValue();
        Integer numValueOf = Integer.valueOf(iIntValue != 0 ? iIntValue2 / num2.intValue() : iIntValue2);
        this._intervalDuration = numValueOf;
        this._nextInterval = numValueOf;
    }

    @Override // com.unity3d.services.core.timer.BaseTimer, com.unity3d.services.core.timer.IBaseTimer
    public void kill() {
        super.kill();
        this._timerListener = null;
    }

    @Override // com.unity3d.services.core.timer.IIntervalTimer
    public void onNextInterval() {
        IIntervalTimerListener iIntervalTimerListener = this._timerListener;
        if (iIntervalTimerListener != null) {
            iIntervalTimerListener.onNextIntervalTriggered();
        }
        this._nextInterval = Integer.valueOf(this._intervalDuration.intValue() + this._nextInterval.intValue());
    }

    @Override // com.unity3d.services.core.timer.BaseTimer
    public void onStep() {
        if (this._currentPosition.addAndGet(this._delayMs.intValue()) >= this._nextInterval.intValue()) {
            onNextInterval();
        }
        super.onStep();
    }
}
