package com.badlogic.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.utils.Null;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusListener implements EventListener {

    /* JADX INFO: renamed from: com.badlogic.gdx.scenes.scene2d.utils.FocusListener$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$scenes$scene2d$utils$FocusListener$FocusEvent$Type;

        static {
            int[] iArr = new int[FocusEvent.Type.values().length];
            $SwitchMap$com$badlogic$gdx$scenes$scene2d$utils$FocusListener$FocusEvent$Type = iArr;
            try {
                iArr[FocusEvent.Type.keyboard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$scenes$scene2d$utils$FocusListener$FocusEvent$Type[FocusEvent.Type.scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class FocusEvent extends Event {
        private boolean focused;
        private Actor relatedActor;
        private Type type;

        public enum Type {
            keyboard,
            scroll
        }

        @Null
        public Actor getRelatedActor() {
            return this.relatedActor;
        }

        public Type getType() {
            return this.type;
        }

        public boolean isFocused() {
            return this.focused;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.Event, com.badlogic.gdx.utils.Pool.Poolable
        public void reset() {
            super.reset();
            this.relatedActor = null;
        }

        public void setFocused(boolean z) {
            this.focused = z;
        }

        public void setRelatedActor(@Null Actor actor) {
            this.relatedActor = actor;
        }

        public void setType(Type type) {
            this.type = type;
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.EventListener
    public boolean handle(Event event) {
        if (!(event instanceof FocusEvent)) {
            return false;
        }
        FocusEvent focusEvent = (FocusEvent) event;
        int i = AnonymousClass1.$SwitchMap$com$badlogic$gdx$scenes$scene2d$utils$FocusListener$FocusEvent$Type[focusEvent.getType().ordinal()];
        if (i == 1) {
            keyboardFocusChanged(focusEvent, event.getTarget(), focusEvent.isFocused());
        } else if (i == 2) {
            scrollFocusChanged(focusEvent, event.getTarget(), focusEvent.isFocused());
        }
        return false;
    }

    public void keyboardFocusChanged(FocusEvent focusEvent, Actor actor, boolean z) {
    }

    public void scrollFocusChanged(FocusEvent focusEvent, Actor actor, boolean z) {
    }
}
