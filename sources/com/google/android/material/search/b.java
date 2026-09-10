package com.google.android.material.search;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements SearchBarAnimationHelper.OnLoadAnimationInvocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f817a;

    public /* synthetic */ b(int i) {
        this.f817a = i;
    }

    @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
    public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        switch (this.f817a) {
            case 0:
                onLoadAnimationCallback.onAnimationStart();
                break;
            default:
                onLoadAnimationCallback.onAnimationEnd();
                break;
        }
    }
}
