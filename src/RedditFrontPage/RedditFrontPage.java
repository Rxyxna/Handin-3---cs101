package RedditFrontPage;

import RedditPost.RedditPost;

import java.util.ArrayList;

public class RedditFrontPage {
    private ArrayList<RedditPost> posts;

    public RedditFrontPage() {
        posts = new ArrayList<RedditPost>();
    }

    public void addPost(RedditPost post) {
        posts.add(post);
    }

    public ArrayList<RedditPost> getPosts() {
        return posts;
    }

}
