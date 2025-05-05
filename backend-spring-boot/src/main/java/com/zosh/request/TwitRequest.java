package com.zosh.request;

import java.time.LocalDateTime;

import com.zosh.model.Twit;

import lombok.Data;

@Data
public class TwitRequest {
	
    private String content;
    
    private Long twitId;

    private LocalDateTime createdAt;

    private String image; 
    
    private boolean isReply;
    
    private boolean isTwit;
    
    private Long replyFor;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getTwitId() {
        return twitId;
    }

    public void setTwitId(Long twitId) {
        this.twitId = twitId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isReply() {
        return isReply;
    }

    public void setReply(boolean reply) {
        isReply = reply;
    }

    public boolean isTwit() {
        return isTwit;
    }

    public void setTwit(boolean twit) {
        isTwit = twit;
    }

    public Long getReplyFor() {
        return replyFor;
    }

    public void setReplyFor(Long replyFor) {
        this.replyFor = replyFor;
    }
}
