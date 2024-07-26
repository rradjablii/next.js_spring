const FullWidthContainer = ({children}:{children:React.ReactNode})=>{
    const styles={
        height:"100vh",
        display:"flex",
        alignItems:"center",
        justifyContent:"center"
    };
    return (
        <div style={styles}>{children}</div>
    );
}
export default FullWidthContainer;