/*
 * Copyright (C) 2018 Softbank Robotics Europe
 * See COPYING for the license
 */

package com.softbankrobotics.qisdktutorials.ui.conversation;

class ConversationItem {

    private final String text;
    private final ConversationItemType type;

    ConversationItem(String text, ConversationItemType type) {
        this.text = text;
        this.type = type;
    }

    String getText() {
        return text;
    }

    ConversationItemType getType() {
        return type;
    }
}
