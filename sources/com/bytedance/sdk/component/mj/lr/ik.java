package com.bytedance.sdk.component.mj.lr;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ik implements Comparable<ik>, Runnable {
    public static final int EIGHTH_PRIORITY = 8;
    public static final int FIFTH_PRIORITY = 5;
    public static final int FOURTH_PRIORITY = 4;
    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;
    public static final int NINTH_PRIORITY = 9;
    public static final int SECOND_PRIORITY = 2;
    public static final int SEVENTH_PRIORITY = 7;
    public static final int SIXTH_PRIORITY = 6;
    public static final int THIRD_PRIORITY = 3;
    private long di;
    private long fi;
    private Runnable ik;
    private long ka;
    private String lr;
    private int ri;

    public ik(String str) {
        this.ri = 5;
        this.lr = str;
    }

    public long getAfterTimestamp() {
        return this.di;
    }

    public long getBeforeTimestamp() {
        return this.fi;
    }

    public String getName() {
        return this.lr;
    }

    public int getPriority() {
        return this.ri;
    }

    public long getRunTime() {
        return this.di - this.fi;
    }

    public long getSubmitTimestamp() {
        return this.ka;
    }

    public Runnable getTarget() {
        return this.ik;
    }

    public long getWaitTime() {
        return this.fi - this.ka;
    }

    public void setAfterTimestamp(long j) {
        this.di = j;
    }

    public void setBeforeTimestamp(long j) {
        this.fi = j;
    }

    public void setPriority(int i) {
        this.ri = i;
    }

    public void setSubmitTimestamp(long j) {
        this.ka = j;
    }

    public void setTarget(Runnable runnable) {
        this.ik = runnable;
    }

    @Override // java.lang.Comparable
    public int compareTo(ik ikVar) {
        if (getPriority() < ikVar.getPriority()) {
            return 1;
        }
        return getPriority() >= ikVar.getPriority() ? -1 : 0;
    }

    public ik(String str, int i) {
        this.ri = i;
        this.lr = str;
    }

    public ik(int i, String str, Runnable runnable) {
        this.ri = i;
        this.lr = str;
        this.ik = runnable;
    }

    public ik(String str, Runnable runnable) {
        this.ri = 5;
        this.lr = str;
        this.ik = runnable;
    }
}
