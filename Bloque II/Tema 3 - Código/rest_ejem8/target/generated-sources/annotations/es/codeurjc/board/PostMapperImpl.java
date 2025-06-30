package es.codeurjc.board;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-21T19:39:33+0100",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.41.0.v20241217-1506, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public PostDTO toDTO(Post post) {
        if ( post == null ) {
            return null;
        }

        Long id = null;
        String user = null;
        String title = null;
        String text = null;

        id = post.getId();
        user = post.getUser();
        title = post.getTitle();
        text = post.getText();

        PostDTO postDTO = new PostDTO( id, user, title, text );

        return postDTO;
    }

    @Override
    public List<PostDTO> toDTOs(Collection<Post> posts) {
        if ( posts == null ) {
            return null;
        }

        List<PostDTO> list = new ArrayList<PostDTO>( posts.size() );
        for ( Post post : posts ) {
            list.add( toDTO( post ) );
        }

        return list;
    }

    @Override
    public Post toDomain(PostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        Post post = new Post();

        if ( postDTO.id() != null ) {
            post.setId( postDTO.id() );
        }
        post.setUser( postDTO.user() );
        post.setTitle( postDTO.title() );
        post.setText( postDTO.text() );

        return post;
    }
}
