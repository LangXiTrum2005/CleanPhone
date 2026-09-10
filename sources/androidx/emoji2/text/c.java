package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40a;
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader b;

    public /* synthetic */ c(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader, int i) {
        this.f40a = i;
        this.b = fontRequestMetadataLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f40a;
        FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = this.b;
        switch (i) {
            case 0:
                fontRequestMetadataLoader.createMetadata();
                break;
            default:
                fontRequestMetadataLoader.loadInternal();
                break;
        }
    }
}
