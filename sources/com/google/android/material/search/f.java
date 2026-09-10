package com.google.android.material.search;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f821a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i) {
        this.f821a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f821a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((SearchViewAnimationHelper) obj).lambda$startShowAnimationExpand$0();
                break;
            case 1:
                ((SearchViewAnimationHelper) obj).lambda$startShowAnimationTranslate$1();
                break;
            default:
                ((SearchBar) obj).lambda$startOnLoadAnimation$1();
                break;
        }
    }
}
