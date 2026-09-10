package com.badlogic.gdx;

import com.badlogic.gdx.utils.Disposable;

/* JADX INFO: loaded from: classes.dex */
public interface Screen extends Disposable {
    @Override // com.badlogic.gdx.utils.Disposable
    void dispose();

    void hide();

    void pause();

    void render(float f);

    void resize(int i, int i2);

    void resume();

    void show();
}
