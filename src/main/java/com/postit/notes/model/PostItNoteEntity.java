package com.postit.notes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "post_it_note_entity")
public class PostItNoteEntity {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name= "CLIENT_SEQUENCE", sequenceName = "CLIENT_SEQUENCE_ID", initialValue=3, allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="CLIENT_SEQUENCE")
	@Column(name="post_id")
	private Long postId;
	
	@Column(name="post_text")
	private String postText;
	
	@Column(name="post_content")
	private String postContent;
	
	@Column(name="post_title")
	private String postTitle;
	 

	public PostItNoteEntity() {
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getPostText() {
		return postText;
	}

	public void setPostText(String postText) {
		this.postText = postText;
	}

	@Override
	public String toString() {
		return "PostItNoteEntity [postId=" + postId + ", postText=" + postText + "]";
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}	
}
