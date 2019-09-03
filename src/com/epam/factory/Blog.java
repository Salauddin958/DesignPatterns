package com.epam.factory;

public class Blog extends Website{

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new ContactPage());
		pages.add(new CommentPage());
		pages.add(new AboutPage());
	}

}
