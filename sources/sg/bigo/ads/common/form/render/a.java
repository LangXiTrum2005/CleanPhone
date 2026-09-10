package sg.bigo.ads.common.form.render;

import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f47177a;

    public static int a() {
        return f47177a ? -12957095 : -2234903;
    }

    public static int b() {
        return f47177a ? -2431246 : -14275021;
    }

    public static int a(int i2) {
        switch (i2) {
            case 1:
                return f47177a ? R.layout.bigo_ad_form_content_dark : R.layout.bigo_ad_form_content;
            case 2:
                return f47177a ? R.layout.bigo_ad_form_fill_question_dark : R.layout.bigo_ad_form_fill_question;
            case 3:
                return f47177a ? R.layout.bigo_ad_form_layout_dark : R.layout.bigo_ad_form_layout;
            case 4:
                return f47177a ? R.layout.bigo_ad_form_notice_privacy_dark : R.layout.bigo_ad_form_notice_privacy;
            case 5:
                return f47177a ? R.layout.bigo_ad_form_question_dark : R.layout.bigo_ad_form_question;
            case 6:
                return f47177a ? R.layout.bigo_ad_form_select_question_dark : R.layout.bigo_ad_form_select_question;
            case 7:
                return f47177a ? R.layout.bigo_ad_success_submit_dark : R.layout.bigo_ad_success_submit;
            default:
                return -1;
        }
    }
}
